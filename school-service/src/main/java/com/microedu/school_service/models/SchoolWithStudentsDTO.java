package com.microedu.school_service.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class SchoolWithStudentsDTO {
    private School school;
    private List<Object> students;
}
