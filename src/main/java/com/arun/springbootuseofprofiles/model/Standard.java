package com.arun.springbootuseofprofiles.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(
        uniqueConstraints = {
                @UniqueConstraint(name = "name_sec", columnNames = {"name", "section"})
        })
public class Standard {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String section;
    @OneToMany(
            orphanRemoval = true
    )
    private List<Student> students;
}
