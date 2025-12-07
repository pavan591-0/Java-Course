package com.example.demo.controllers;

import com.example.demo.dto.StudentRequestDTO;
import com.example.demo.dto.StudentResponseDTO;
import com.example.demo.exception.InvalidDataException;
import com.example.demo.exception.StudentNotFoundException;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("")
    public List<Student> getStudents(){
        return studentService.getStudentsList();
    }

    @GetMapping("/{id}")
    public Student getStudentWithId(@PathVariable int id){
        return studentService.getStudentWithId(id);
    }

    @PostMapping("")
    public ResponseEntity<?> addStudent(@Valid @RequestBody StudentRequestDTO student){
       Student newStudent = studentService.addStudent(student);

        if(student.getName().isBlank())
            throw new InvalidDataException("Name Should not be empty");
        else if (student.getMarks() < 0 || student.getMarks() > 100)
            throw new InvalidDataException("Marks should be between 0-100");

       return ResponseEntity
               .status(HttpStatus.CREATED)
               .body(new StudentResponseDTO(
                       "Created new Student successfully",
                       newStudent));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable int id, @RequestBody StudentRequestDTO student){

        Student updatedStudent = studentService.updateStudent(id, student);

        return ResponseEntity.
                ok(
                        new StudentResponseDTO("Updated Successfully", updatedStudent));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable int id){
        boolean status = studentService.deleteStudent(id);
        if(!status) throw new StudentNotFoundException("No student is present with id: "+id);
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/marks")
    public ResponseEntity<?> filterStudentsByMarks(@RequestParam int min,
                                                   @RequestParam int max){
        List<Student> result = studentService.filterStudentsByMarks(min, max);
        return ResponseEntity.ok().body(result);
    }
}
