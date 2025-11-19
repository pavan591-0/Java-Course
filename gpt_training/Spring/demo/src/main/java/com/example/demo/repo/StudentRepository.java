package com.example.demo.repo;

import com.example.demo.dto.StudentRequestDTO;
import com.example.demo.exception.InvalidDataException;
import com.example.demo.exception.StudentNotFoundException;
import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private List<Student> students = new ArrayList<>(
            List.of(
                    new Student(1, "Mikasa", 95),
                    new Student(2, "Eren", 86),
                    new Student(3, "Naruto", 40)
            )
    );
    public List<Student> getStudentsList(){
        return students;
    }

    public Student getStudentWithId(int id) {
        return getStudentsList().stream().filter(s -> s.getId() == id).findFirst()
                .orElseThrow(() -> new StudentNotFoundException("No student with id: "+ id +" exists"));
//                .orElse(new Student(0, "No such student", 0));
    }

    public Student addStudent(Student student) {

        students.add(new Student(
                students.size() + 1,
                student.getName(),
                student.getMarks()
        ));
        return students.get(students.size() - 1);
    }

    public Student updateStudent(int id, StudentRequestDTO student) {
        Student stud = findStudentById(id);
        if(stud != null){
            stud.setName(student.getName());
            stud.setMarks(student.getMarks());
            return stud;
        }
        throw new StudentNotFoundException("There is no student with such id: "+id);
    }

    public boolean deleteStudent(int id) {
        Student stud = findStudentById(id);
        if(stud != null) {
            students.remove(stud);
            return true;
        }
        return false;
    }

    public Student findStudentById(int id){
        for (Student stud: students){
            if(stud.getId() == id){
                return stud;
            }
        }
        return null;
    }
}
