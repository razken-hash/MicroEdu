package com.microedu.student_service.models;

import lombok.*;

@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
public class StudentWithSchool {
    private Student student;
    private Object school;
}
