package com.codeclan.example.one2many.hwk.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    @Column(name = "title")
    private String title;

    @Column(name = "name")
    private ArrayList<File> file;

    @Column(name = "user")
    private String user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"folder"})
    private List<Files> files;

    public Folder(String title, ArrayList<File> file, String user, Long id) {
        this.title = title;
        this.file = file;
        this.user = user;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<File> getFile() {
        return file;
    }

    public void setFile(ArrayList<File> file) {
        this.file = file;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}



