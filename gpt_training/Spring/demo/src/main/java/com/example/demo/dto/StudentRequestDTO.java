package com.example.demo.dto;

public class StudentRequestDTO {

    private String name;
    private int marks;

    public StudentRequestDTO(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentRequestDTO{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
