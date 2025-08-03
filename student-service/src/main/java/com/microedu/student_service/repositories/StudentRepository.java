package com.microedu.student_service.repositories;

import com.microedu.student_service.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
