package com.microedu.school_service.controllers;

import com.microedu.school_service.models.School;
import com.microedu.school_service.services.SchoolService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@AllArgsConstructor
public class SchoolController {
    final private SchoolService schoolService;

    @GetMapping
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }

    @GetMapping("/{schoolId}")
    public School getSchoolById(@PathVariable Integer schoolId) {
        return schoolService.getSchoolById(schoolId);
    }

    @PostMapping("/create")
    @ResponseStatus(value = HttpStatus.CREATED)
    public School createSchool(@RequestBody School school) {
        return schoolService.createSchool(school);
    }

    @DeleteMapping("/delete/{schoolId}")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteSchoolById(@PathVariable Integer schoolId) {
        schoolService.deleteSchool(schoolId);
    }
}
