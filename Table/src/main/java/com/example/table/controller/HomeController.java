package com.example.table.controller;

import com.example.table.dto.SubjectStudentRequest;
import com.example.table.service.StudentServiceI;
import com.example.table.entity.Student;
import com.example.table.entity.Subject;
import com.example.table.service.SubjectServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HomeController {

    @Autowired
    private StudentServiceI studentService;

    @Autowired
    private SubjectServiceI subjectService;

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        Student student1=this.studentService.addUser(student);
       return ResponseEntity.status(HttpStatus.CREATED).body(student1);
    }

    @PostMapping("/addSubject")
    public ResponseEntity<Subject> addSubject(@RequestBody Subject subject){
        Subject sub1=this.subjectService.addSubject(subject);
        return ResponseEntity.status(HttpStatus.CREATED).body(sub1);
    }

    @GetMapping("/findStudent{id}")
    public ResponseEntity<Student> findStudent(@PathVariable int id){
        Student st1=this.studentService.findById(id);
        if(st1==null) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.of(Optional.of(st1));
    }


    @GetMapping("/findSubject/{subCode}")
    public ResponseEntity<Subject> findStudent(@PathVariable String subCode){
        Subject st1=this.subjectService.findBySubjectCode(subCode);
        if(st1==null) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.of(Optional.of(st1));
    }


    @PutMapping("/assignSubject")
    public ResponseEntity<Student> assignSubjectToStudent(@RequestBody SubjectStudentRequest subjectStudentRequest){
        Student student = studentService.assignSubject(subjectStudentRequest.getId(), subjectStudentRequest.getSubCode());
        return ResponseEntity.of(Optional.of(student));
    }


}
