package com.spring.controller;

import com.spring.entities.Exams;
import com.spring.entities.Subject;
import com.spring.service.ExamServiceI;
import com.spring.service.SubjectServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exams")
public class ExamController {

    @Autowired
    private ExamServiceI examService;

    @PostMapping("/addExams")
    public ResponseEntity<Exams>  addExams(@RequestBody Exams exams){
        Exams exams1=this.examService.addExams(exams);
        return ResponseEntity.status(HttpStatus.CREATED).body(exams1);
    }

    @PostMapping("/setMarks/{subjectCode}")
    public ResponseEntity<Exams> mapExamAndSubject(@PathVariable String subjectCode,@RequestBody Exams exams){
        Exams exams1 = this.examService.assignSubjectToExam(subjectCode, exams);
        return ResponseEntity.status(HttpStatus.CREATED).body(exams1);
    }

}
