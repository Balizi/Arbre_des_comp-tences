package com.example.model;

import jakarta.persistence.*;

@Entity
public class StudentSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "level")
    @Basic
    private int level;
    @Column(name = "status")
    @Basic
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "id_student",referencedColumnName = "id")
    private Students students;

    @ManyToOne
    @JoinColumn(name = "id_Skills",referencedColumnName = "id")
    private Skills skills;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
