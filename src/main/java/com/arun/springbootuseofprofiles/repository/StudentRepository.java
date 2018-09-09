package com.arun.springbootuseofprofiles.repository;

import com.arun.springbootuseofprofiles.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
