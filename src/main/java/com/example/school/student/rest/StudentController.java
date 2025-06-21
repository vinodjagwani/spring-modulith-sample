package com.example.school.student.rest;

import com.example.school.student.dto.StudentCreateRequestDTO;
import com.example.school.student.service.StudentService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class StudentController {

    StudentService studentService;

    @PostMapping("/enroll")
    public ResponseEntity<String> enrollStudent(@RequestBody @Valid final StudentCreateRequestDTO requestDTO) {
        studentService.enrollStudent(requestDTO);
        return ResponseEntity.ok("Student enrolled successfully: " + requestDTO);
    }
}
