package com.spring.controller;

import com.spring.entities.Subject;
import com.spring.service.SubjectServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subject")
@CrossOrigin(origins = "http://localhost:3000")
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

    @GetMapping("/findSubject/{subjectCode}")
    public ResponseEntity<Subject> findSubject(@PathVariable String subjectCode){
        Subject subject=this.subjectService.findSubject(subjectCode);
        if(subject==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(subject));
    }

    @PutMapping("/updateMarks/{subjectCode}")
    public ResponseEntity<Subject> updateMarks(@PathVariable String subjectCode, @RequestBody Subject subject) {
        Subject subject1 = this.subjectService.updateMarks(subjectCode, subject);
        System.out.println(subject1.getAssignmentMarks());
        if (subject1 == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(subject1);
    }


    @PutMapping("/updateAssignments/{subjectCode}")
    public ResponseEntity<Subject> updateAssignments(@PathVariable String subjectCode, @RequestBody Subject subject) {
        Subject subject1 = this.subjectService.updateAssignments(subjectCode, subject);

        if (subject1 == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(subject1);
    }




}
