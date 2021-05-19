package com.codeclan.example.one2many.hwk.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Column(name = "name")
    private String name;

    @Column(name = "folders")
    private ArrayList<Folder> folder;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"user"})
    private List<Folder> folders;

    public User(String name, ArrayList<Folder> folders, Long id) {
        this.name = name;
        this.folder = folders;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Folder> getFolders() {
        return folder;
    }

    public void setFolders(ArrayList<Folder> folders) {
        this.folder = folders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}




