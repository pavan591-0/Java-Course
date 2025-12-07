package com.example.demo.dto;

import com.example.demo.model.Student;

import java.util.List;

public class StudentPageResponseDTO {
    private List<Student> students;
    private int page;
    private int size;
    private int totalItems;

    public StudentPageResponseDTO(List<Student> students, int page, int size, int totalItems) {
        this.students = students;
        this.page = page;
        this.size = size;
        this.totalItems = totalItems;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    @Override
    public String toString() {
        return "StudentPageResponseDTO{" +
                "students=" + students +
                ", page=" + page +
                ", size=" + size +
                ", totalItems=" + totalItems +
                '}';
    }
}
