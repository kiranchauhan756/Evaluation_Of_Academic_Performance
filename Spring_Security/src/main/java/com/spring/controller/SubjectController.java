package com.spring.controller;

import com.spring.entities.Subject;
import com.spring.service.SubjectServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectServiceI subjectService;

    @PostMapping("/addSubject")
    public ResponseEntity<Subject> addSubject(@RequestBody Subject subject) {
        Subject user1 = this.subjectService.addSubject(subject);

        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @PutMapping("/updateSubject/{subjectCode}")
    public ResponseEntity<Subject> updateSubject(@PathVariable String subjectCode, @RequestBody Subject subject) {
        Subject subject1 = this.subjectService.updateSubject(subjectCode, subject);
        if (subject1 == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(subject1);
    }

    @DeleteMapping("/deleteSubject/{subjectCode}")
    public void deleteSubject(@PathVariable String subjectCode) {
        this.subjectService.deleteSubject(subjectCode);
    }

    @GetMapping("/getAllSubjects")
    public ResponseEntity<List<Subject>> getAllSubjects() {
        List<Subject> list = new ArrayList<>();
        list = this.subjectService.getAllSubjects();
        if (list.isEmpty()) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
    }

}
