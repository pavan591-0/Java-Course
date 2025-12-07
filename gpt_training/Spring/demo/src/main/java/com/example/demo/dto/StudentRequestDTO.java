package com.example.demo.dto;

import com.example.demo.annotations.CapitalizationCheck;
import com.example.demo.annotations.NoSpaceCheck;
import com.example.demo.annotations.ValidMarksRange;
import com.example.demo.annotations.ValidateStudent;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@ValidateStudent
public class StudentRequestDTO {

    @NotBlank(message = "Name cannot be blank")
    @NoSpaceCheck
    @CapitalizationCheck
    private String name;

//    @Min(value = 0, message = "Marks must be >=0")
//    @Max(value = 100, message = "MArks must be <=100")
    @NotNull(message = "Marks cannot be null")
    @ValidMarksRange
    private Integer marks;

    public StudentRequestDTO() {}

    public StudentRequestDTO(String name, Integer marks){
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
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
