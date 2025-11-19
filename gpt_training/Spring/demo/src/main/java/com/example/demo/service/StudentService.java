package com.example.demo.service;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.exception.InvalidDataException;
import com.example.demo.repo.StudentRepository;
import com.example.demo.dto.StudentRequestDTO;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

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
}
