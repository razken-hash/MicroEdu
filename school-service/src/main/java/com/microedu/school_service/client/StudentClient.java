package com.microedu.school_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "students", url = "${application.config.students-url}")
public interface StudentClient {

    @GetMapping("/by-school/{schoolId}")
    List<Object> getStudentsBySchoolId(@PathVariable Integer schoolId);
}
