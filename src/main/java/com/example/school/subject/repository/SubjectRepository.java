package com.example.school.subject.repository;

import com.example.school.subject.repository.entity.Subject;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface SubjectRepository extends JpaRepositoryImplementation<Subject, String> {

}
