package com.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Technologie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    @Basic
    private String name;

    @ManyToMany(mappedBy = "technologieList")
    private List<Skills> skills;

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
}
