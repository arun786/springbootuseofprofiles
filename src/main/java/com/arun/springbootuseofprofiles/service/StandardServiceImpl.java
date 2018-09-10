package com.arun.springbootuseofprofiles.service;

import com.arun.springbootuseofprofiles.model.Standard;
import com.arun.springbootuseofprofiles.model.Student;
import com.arun.springbootuseofprofiles.repository.StandardRepository;
import com.arun.springbootuseofprofiles.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StandardServiceImpl implements StandardService {

    private StandardRepository standardRepository;
    private StudentRepository studentRepository;

    @Autowired
    public StandardServiceImpl(StandardRepository standardRepository, StudentRepository studentRepository) {
        this.standardRepository = standardRepository;
        this.studentRepository = studentRepository;
    }


    @Override
    public Standard createStandard(Standard standard) {
        List<Student> students = standard.getStudents();
        studentRepository.save(students.get(0));
        return standardRepository.save(standard);
    }
}
