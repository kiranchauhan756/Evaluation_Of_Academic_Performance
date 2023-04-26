package com.spring.service;

import com.spring.entities.Assignment;
import com.spring.repo.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignmentService implements AssignmentServiceI{

    @Autowired
    private AssignmentRepository  assignmentRepository;

    @Override
    public Assignment addAssignment(Assignment assignment) {
        Assignment assignment1=this.assignmentRepository.save(assignment);
        return assignment1;
    }
}
