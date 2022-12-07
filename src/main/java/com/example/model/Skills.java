package com.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Basic
    private Long id;
    @Column(name = "name",length = 40)
    @Basic
    private String name;
    @OneToOne
    @JoinColumn(name = "id_teacher",referencedColumnName = "id")
    private Teachers teachers;

    @OneToMany
    @JoinColumn(name = "id_StudentSkill",referencedColumnName = "id")
    private List<StudentSkills> studentSkills;

    @ManyToMany
    @JoinColumn(name = "id_Technologier", referencedColumnName = "id")
    private List<Technologie> technologieList;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }


}
