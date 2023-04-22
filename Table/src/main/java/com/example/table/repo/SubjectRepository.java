package com.example.table.repo;

import com.example.table.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubjectRepository extends JpaRepository<Subject,String> {

    Subject findBySubCode(String subCode);
}
