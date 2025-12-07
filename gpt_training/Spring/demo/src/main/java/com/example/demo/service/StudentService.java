package com.example.demo.service;

import com.example.demo.dto.MultipleStudentResponseDTO;
import com.example.demo.dto.StudentPageResponseDTO;
import com.example.demo.dto.StudentResponseDTO;
import com.example.demo.exception.DuplicateNameException;
import com.example.demo.exception.IllegalParameterException;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.exception.InvalidDataException;
import com.example.demo.repo.StudentRepository;
import com.example.demo.dto.StudentRequestDTO;
import com.example.demo.model.Student;
import com.example.demo.util.ReflectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;



    private static final Map<String, Comparator<Student>> FINAL_MAP
            = Map.of(
            "marks", Comparator.comparing(Student::getMarks),
            "name", Comparator.comparing(Student::getName),
            "id", Comparator.comparing(Student::getId));

    public String welcomeNote() {
        return "You are currently getting data from the student service";
    }

    public List<Student> getStudentsList() {
        return studentRepository.getStudentsList();
    }

    public Student getStudentWithId(int id) {
        return studentRepository.getStudentWithId(id);
    }

    public Student addStudent(StudentRequestDTO student) {
        if(student.getName().isBlank())
            throw new InvalidDataException("Name Should not be empty");
        else if (student.getMarks() < 0 || student.getMarks() > 100)
            throw new InvalidDataException("Marks should be between 0-100");
        else if(!checkName(student.getName()))
            throw new DuplicateNameException("Name should be unique");
        return studentRepository.addStudent(StudentMapper.mapToStudent(student));
    }

    public Student updateStudent(int id, StudentRequestDTO student) {
        return  studentRepository.updateStudent(id, student);
    }

    public boolean deleteStudent(int id) {
        return studentRepository.deleteStudent(id);
    }

    public List<Student> filterStudentsByMarks(int min, int max) {
        List<Student> data = studentRepository.getStudentsList();
        return data.stream()
                .filter(s -> s.getMarks() > min && s.getMarks() < max)
                .toList();
    }

    public StudentPageResponseDTO sortStudentData(String by, String order, int page, int size) {

        List<Student> data = studentRepository.getStudentsList();
        Comparator<Student> dataFeild = FINAL_MAP.get(by.toLowerCase());

        if(dataFeild == null) throw new IllegalParameterException("Sorting Categories are only id, name and marks");

        if(order.equals("desc")) dataFeild = dataFeild.reversed();

        List<Student> sorted = data.stream().sorted(dataFeild).toList();

        int start = page * size;
        int end = Math.min(start + size, sorted.size());

        if(start >= sorted.size())
            return new StudentPageResponseDTO(List.of(), page, size, sorted.size());

        return new StudentPageResponseDTO(sorted.subList(start, end), page, size, sorted.size());

    }

    public StudentResponseDTO updateMarks(int id, int marks) {
        if(marks < 0 || marks > 100){
           throw new InvalidDataException("Marks should be between 0-100");
        }
        return studentRepository.updateMarks(id, marks);
    }

    public MultipleStudentResponseDTO sortStudentsByMultiple(List<String> sort) {
        List<Student> students = studentRepository.getStudentsList();
        if(sort.isEmpty()) return StudentMapper.mapToMultipleStudentResponse(students
                , "Student Lists");

        List<Comparator<Student>> comparators = getComparators(sort);

        Comparator<Student> finalComparator = comparators.stream()
                .reduce(Comparator::thenComparing)
                .orElseThrow();

        List<Student> response = students.stream().sorted(finalComparator).toList();

        System.out.println(response);

        return StudentMapper.mapToMultipleStudentResponse(response,
                "Sorted StudentList");


    }

    private static List<Comparator<Student>> getComparators(List<String> sort) {
        List<Comparator<Student>> comparators = new ArrayList<>();

        for(String values: sort){
           String[] parts = values.split(",");
           final String field = parts[0];
           final String order = parts[1];

            Comparator<Student> comp = Comparator.comparing(stud ->
                    (Comparable) ReflectionUtils.getFeildValue((Object) stud
                    , field));
            if(order.equals("desc")){
                comp = comp.reversed();
            }
            comparators.add(comp);
        }
        return comparators;
    }

    public boolean checkName(String name) {
        return studentRepository.getStudentsList().stream()
                .noneMatch(stud -> stud.getName().toLowerCase().trim().equals(name.toLowerCase().trim()));
    }
}
