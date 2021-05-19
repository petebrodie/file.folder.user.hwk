package com.codeclan.example.one2many.hwk.repositories;

import com.codeclan.example.one2many.hwk.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}

