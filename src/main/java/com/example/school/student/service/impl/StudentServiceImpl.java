package com.example.school.student.service.impl;

import com.example.school.student.dto.StudentCreateRequestDTO;
import com.example.school.student.repository.StudentRepository;
import com.example.school.student.repository.entity.Student;
import com.example.school.student.service.StudentService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    ApplicationEventPublisher publisher;

    public void enrollStudent(final StudentCreateRequestDTO requestDTO) {
        log.info("Start enrolling student with requestDTO: {}", requestDTO.name());
        final Student student = new Student();
        student.setName(requestDTO.name());
        studentRepository.save(student);
        publisher.publishEvent(requestDTO);
        log.info("Finish enrolling student with requestDTO: {} ", requestDTO);
    }
}
