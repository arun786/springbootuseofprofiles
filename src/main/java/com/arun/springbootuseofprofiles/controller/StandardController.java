package com.arun.springbootuseofprofiles.controller;

import com.arun.springbootuseofprofiles.model.Standard;
import com.arun.springbootuseofprofiles.service.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StandardController {

    @Autowired
    private StandardService standardService;

    @PutMapping("/standards/v1/standard")
    public ResponseEntity<Standard> createStandard(@RequestBody Standard standard) {
        Standard standard1 = standardService.createStandard(standard);
        return new ResponseEntity<>(standard1, HttpStatus.OK);
    }
}
