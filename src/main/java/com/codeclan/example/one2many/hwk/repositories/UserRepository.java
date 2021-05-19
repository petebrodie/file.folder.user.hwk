package com.codeclan.example.one2many.hwk.repositories;

import com.codeclan.example.one2many.hwk.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

