package com.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Basic
    private Long id;
    @Column(name = "fName")
    @Basic
    private String fName;
    @Column(name = "lName")
    @Basic
    private String lName;
    @Column(name = "email")
    @Basic
    private String email;
    @Column(name = "password")
    @Basic
    private String paasword;
    @OneToMany
    @JoinColumn(name = "id_users",referencedColumnName = "id")
    private List<Students> studentsList;

    @OneToMany
    @JoinColumn(name = "id_skills" ,referencedColumnName = "id")
    private List<Skills> skillsList;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaasword() {
        return paasword;
    }

    public void setPaasword(String paasword) {
        this.paasword = paasword;
    }

    public List<Students> getUsersList() {
        return studentsList;
    }

    public void setUsersList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    public List<Skills> getSkillsList() {
        return skillsList;
    }

    public void setSkillsList(List<Skills> skillsList) {
        this.skillsList = skillsList;
    }
}