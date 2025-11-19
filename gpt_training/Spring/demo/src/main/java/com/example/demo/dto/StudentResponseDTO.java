package com.example.demo.dto;


import com.example.demo.model.Student;

public class StudentResponseDTO {

    private Student student;
    private String message;

    public StudentResponseDTO(String message, Student student) {
        this.message = message;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "StudentChangeResponse{" +
                "student=" + student +
                ", message='" + message + '\'' +
                '}';
    }
}
