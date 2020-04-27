package com.example.javatest.repository;

import com.example.javatest.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

	Category findById(int categoryId);

	
}
