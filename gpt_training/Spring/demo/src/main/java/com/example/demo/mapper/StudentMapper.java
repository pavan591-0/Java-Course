package com.example.demo.mapper;

import com.example.demo.dto.MultipleStudentResponseDTO;
import com.example.demo.dto.StudentRequestDTO;
import com.example.demo.dto.StudentResponseDTO;
import com.example.demo.model.Student;

import java.util.List;

public class StudentMapper {

    public static Student mapToStudent(StudentRequestDTO dto){
        return new Student(dto.getName(), dto.getMarks());
    }
    public static StudentResponseDTO mapToResponse(Student student, String message){
        return new StudentResponseDTO(message, student);
    }
    public static MultipleStudentResponseDTO mapToMultipleStudentResponse(List<Student> students, String message){
        return new MultipleStudentResponseDTO(students, message);
    }

}
