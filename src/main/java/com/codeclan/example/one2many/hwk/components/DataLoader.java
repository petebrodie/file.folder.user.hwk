package com.codeclan.example.one2many.hwk.components;

import com.codeclan.example.one2many.hwk.models.User;
import com.codeclan.example.one2many.hwk.repositories.FileRepository;
import com.codeclan.example.one2many.hwk.repositories.FolderRepository;
import com.codeclan.example.one2many.hwk.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User1 = new User("Pete", "1");
    }

}
