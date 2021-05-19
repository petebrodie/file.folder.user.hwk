package com.codeclan.example.one2many.hwk.models;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {

    @Column(name = "name")
    private String name;

    @Column (name = "extension")
    private String extension;

    @Column(name = "size")
    private int size;

    @Column(name = "folder")
    private String folder;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public File(String name, String extension, int size, String folder, Long id) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}


