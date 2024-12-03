package com.kinjo.E_com_Backend2.repository;

import com.kinjo.E_com_Backend2.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
