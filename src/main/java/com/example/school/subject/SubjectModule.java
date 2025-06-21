package com.example.school.subject;


import org.springframework.modulith.ApplicationModule;

@ApplicationModule(
        allowedDependencies = {"student", "student::SubjectService"},
        displayName = "Subject Management",
        id = "subject"
)
public class SubjectModule {
}
