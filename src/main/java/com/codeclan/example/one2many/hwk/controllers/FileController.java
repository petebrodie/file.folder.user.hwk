package com.codeclan.example.one2many.hwk.controllers;

import com.codeclan.example.one2many.hwk.models.File;
import com.codeclan.example.one2many.hwk.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles() {
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity getFile(@PathVariable Long id) {
        return new ResponseEntity<>(fileRepository.findById(id), HttpStatus.OK);
    }

    //    CREATE - POST REQUEST
    @PostMapping(value = "/pirates")
    public ResponseEntity<File> postPirate(@RequestBody File files) {
        fileRepository.save(files);
        return new ResponseEntity<>(files, HttpStatus.CREATED);
    }

}
