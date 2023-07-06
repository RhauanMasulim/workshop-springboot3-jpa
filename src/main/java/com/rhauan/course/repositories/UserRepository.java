package com.rhauan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rhauan.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}