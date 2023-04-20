package com.spring.repo;

import com.spring.entities.Student;
import org.hibernate.mapping.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

    Student findByEmail(String email);
    List<Student> findAllByCourseAndYearAndSemesterAndBranch(String course,int year,String semester,String branch);

}
