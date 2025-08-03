package com.microedu.student_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Schools", url = "${application.config.schools-url}")
public interface SchoolClient {

    @GetMapping("/{schoolId}")
    public Object getSchoolById(@PathVariable Integer schoolId);
}
