package com.example.koool.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "StudentGroup")
public class StudenGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @Column
    private String email;

    @ManyToOne
    private StudenGroup studenGroup;

    public StudenGroup(int id, String title, String email) {
        this.id = id;
        this.title = title;
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }


}
