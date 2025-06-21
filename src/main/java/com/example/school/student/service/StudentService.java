package com.example.school.student.service;

import com.example.school.student.dto.StudentCreateRequestDTO;


public interface StudentService {

    void enrollStudent(final StudentCreateRequestDTO requestDTO);
}
