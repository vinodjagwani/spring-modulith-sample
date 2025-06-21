package com.example.school.subject.service;

import com.example.school.student.dto.StudentCreateRequestDTO;
import com.example.school.subject.repository.SubjectRepository;
import com.example.school.subject.repository.entity.Subject;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SubjectService {

    SubjectRepository subjectRepository;

    @EventListener
    public void handleStudentEnrolled(final StudentCreateRequestDTO event) {
        log.info("Assigning subjects to enrolled student: {}", event.name());
        final List<Subject> subjects = new ArrayList<>();
        event.subjects().forEach(sub -> {
            final Subject subject = new Subject();
            subject.setCode(sub);
            subjects.add(subject);
        });
        subjectRepository.saveAll(subjects);
    }
}