package com.spring.controller;

import com.spring.entities.Exam;
import com.spring.service.ExamServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exams")
public class ExamController {

    @Autowired
    private ExamServiceI examService;


    @PostMapping("/addExam")
    public ResponseEntity<Exam> addExam(@RequestBody Exam exam){
        Exam exam1=this.examService.addExam(exam);
        if(exam1==null)return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(exam1);
    }
}
