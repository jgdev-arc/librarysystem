package com.tlz.librarysystem.repository;

import com.tlz.librarysystem.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
