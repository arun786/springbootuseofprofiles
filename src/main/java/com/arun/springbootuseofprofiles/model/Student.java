package com.arun.springbootuseofprofiles.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rollNo;
    private String name;
    private String age;
    private String standard;

    public Student(String name, String age, String standard) {
        this.name = name;
        this.age = age;
        this.standard = standard;
    }
}
