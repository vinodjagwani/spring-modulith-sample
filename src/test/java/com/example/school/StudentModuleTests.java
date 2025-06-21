package com.example.school;

import com.example.school.student.dto.StudentCreateRequestDTO;
import com.example.school.student.service.StudentService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.test.ApplicationModuleTest;

@SpringBootTest
@ApplicationModuleTest(module = "student")
class StudentModuleTests {

    @Autowired StudentService studentService;

    @Test
    void testStudentEnrollment() {
        studentService.enrollStudent(new StudentCreateRequestDTO("name", List.of("chem")));
    }
}