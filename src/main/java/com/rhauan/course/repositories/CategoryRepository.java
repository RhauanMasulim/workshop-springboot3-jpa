package com.rhauan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rhauan.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}