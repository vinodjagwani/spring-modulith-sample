package com.example.school.student.repository;

import com.example.school.student.repository.entity.Student;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface StudentRepository extends JpaRepositoryImplementation<Student, String> {

}
