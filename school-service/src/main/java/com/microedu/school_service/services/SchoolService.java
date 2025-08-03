package com.microedu.school_service.services;

import com.microedu.school_service.client.StudentClient;
import com.microedu.school_service.models.School;
import com.microedu.school_service.models.SchoolWithStudentsDTO;
import com.microedu.school_service.repositories.SchoolRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class SchoolService {
    final private SchoolRepository schoolRepository;
    final private StudentClient studentClient;

    public List<School> getAllSchools() {
        return (List<School>) schoolRepository.findAll();
    }

    public School createSchool(School school) {
        return schoolRepository.save(school);
    }

    public School getSchoolById(Integer schoolId) {
        return schoolRepository.findById(schoolId).orElseThrow(()-> new EntityNotFoundException("Not Found"));
    }

    public void deleteSchool(Integer schoolId) {
        schoolRepository.deleteById(schoolId);
    }

    public SchoolWithStudentsDTO getSchoolWithStudents(Integer schoolId) {
        School school = getSchoolById(schoolId);
        List<Object> students = studentClient.getStudentsBySchoolId(schoolId);
      return   new SchoolWithStudentsDTO(school, students);
    }
}
