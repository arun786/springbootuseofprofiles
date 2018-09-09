package com.arun.springbootuseofprofiles.service;

import com.arun.springbootuseofprofiles.exception.UniqueException;
import com.arun.springbootuseofprofiles.model.Department;
import com.arun.springbootuseofprofiles.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private static final Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department createDepartment(Department department) {
        logger.info("Creating Repository {}", department);
        try {
            return departmentRepository.save(department);
        } catch (DataIntegrityViolationException e) {
            throw new UniqueException(e.getMessage());
        }
    }
}
