package com.example.demo.controllers;

import com.example.demo.dto.MultipleStudentResponseDTO;
import com.example.demo.dto.StudentPageResponseDTO;
import com.example.demo.dto.StudentResponseDTO;
import com.example.demo.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentOpsController {

    private final StudentService studentService;


    public StudentOpsController(StudentService studentService){
        this.studentService = studentService;

    }

    @GetMapping("/sorted")
    public ResponseEntity<?> sortStudentData(@RequestParam String by,
                                             @RequestParam String order,
                                             @RequestParam int page,
                                             @RequestParam int size){


        StudentPageResponseDTO response = studentService.sortStudentData(by, order, page, size);

        return ResponseEntity.ok(response);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateMarks(@PathVariable int id, @RequestParam int marks){
        StudentResponseDTO updatedStudent = studentService.updateMarks(id, marks);
        return  ResponseEntity.ok(updatedStudent);
    }

    @GetMapping("/sorted/multi")
    public ResponseEntity<?> sortStudentsByMultiple(@RequestParam List<String> sort){

        MultipleStudentResponseDTO response = studentService.sortStudentsByMultiple(sort);
        return ResponseEntity.ok(response);

    }

}
