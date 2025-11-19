package com.example.demo.mapper;

import com.example.demo.dto.StudentRequestDTO;
import com.example.demo.dto.StudentResponseDTO;
import com.example.demo.model.Student;

public class StudentMapper {

    public static Student mapToStudent(StudentRequestDTO dto){
        return new Student(dto.getName(), dto.getMarks());
    }
    public static StudentResponseDTO mapToResponse(Student student, String message){
        return new StudentResponseDTO(message, student);
    }


}
