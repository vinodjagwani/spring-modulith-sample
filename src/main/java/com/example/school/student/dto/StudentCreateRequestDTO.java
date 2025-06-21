package com.example.school.student.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import org.springframework.modulith.NamedInterface;


@NamedInterface("SubjectService")
public record StudentCreateRequestDTO(
        @NotEmpty(message = "name can't be null or empty")
        @JsonProperty("name") String name,
        @NotNull(message = "subjects can't be null or empty")
        @JsonProperty("subjects") List<@NotEmpty(message = "name can't be null or empty") String> subjects) {

}
