package com.spring.controller;

import com.spring.entities.Assignment;
import com.spring.service.AssignmentServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assign")
public class AssignmentController {

    @Autowired
    private AssignmentServiceI assignmentService;
     @PostMapping("/addAss")
    public ResponseEntity<Assignment> addAssignment(@RequestBody Assignment assignment){
        Assignment assignment1=this.assignmentService.addAssignment(assignment);
        if(assignment1==null) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(assignment1);
    }

}
