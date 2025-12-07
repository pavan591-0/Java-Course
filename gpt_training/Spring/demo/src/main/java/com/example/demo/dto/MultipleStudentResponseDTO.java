package com.example.demo.dto;

import com.example.demo.model.Student;

import java.util.List;

public class MultipleStudentResponseDTO {

    private String message;
    private List<Student> students;

    public MultipleStudentResponseDTO(List<Student> students, String message) {
        this.message = message;
        this.students = students;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "MultipleStudentResponseDTO{" +
                "message='" + message + '\'' +
                ", students=" + students +
                '}';
    }
}
