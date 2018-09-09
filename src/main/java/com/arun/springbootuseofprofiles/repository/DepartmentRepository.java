package com.arun.springbootuseofprofiles.repository;

import com.arun.springbootuseofprofiles.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
