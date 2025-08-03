package com.microedu.school_service.repositories;

import com.microedu.school_service.models.School;
import org.springframework.data.repository.CrudRepository;

public interface SchoolRepository extends CrudRepository<School, Integer> {
}
