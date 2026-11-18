package com.example.kool.model;

import com.example.koool.model.StudenGroup;
import jakarta.persistence.*;

@Entity
@Table(name = "student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    private int age;

    private String email;

    @ManyToOne
    private StudenGroup studenGroup;

    public Student() {
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

