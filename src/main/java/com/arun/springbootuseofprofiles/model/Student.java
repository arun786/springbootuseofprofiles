package com.arun.springbootuseofprofiles.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Student")
public class Student {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rollNo;
    private String name;
    private String age;
    private String year;

    public Student(String name, String age, String year) {
        this.name = name;
        this.age = age;
        this.year = year;
    }
}
