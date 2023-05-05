package com.tlz.librarysystem.repository;

import com.tlz.librarysystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
