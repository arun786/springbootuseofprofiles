package com.arun.springbootuseofprofiles.service;

import com.arun.springbootuseofprofiles.model.Student;
import com.arun.springbootuseofprofiles.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private static final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        logger.info("Student creation {}",student);
         return studentRepository.save(student);
    }
}
