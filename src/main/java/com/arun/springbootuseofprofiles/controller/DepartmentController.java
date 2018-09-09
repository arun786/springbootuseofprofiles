package com.arun.springbootuseofprofiles.controller;

import com.arun.springbootuseofprofiles.model.Department;
import com.arun.springbootuseofprofiles.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments/v1/department/{name}")
    public ResponseEntity<Department> createDepartment(@PathVariable(value = "name") String name) {
        Department department = new Department(name);
        Department department1 = departmentService.createDepartment(department);
        ResponseEntity<Department> response = new ResponseEntity<>(department1, HttpStatus.OK);
        return response;
    }

}
