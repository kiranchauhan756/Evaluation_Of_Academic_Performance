package com.spring.repo;

import com.spring.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubjectRepository extends JpaRepository<Subject,String> {
    Subject findBySubjectCode(String subjectCode);

}
