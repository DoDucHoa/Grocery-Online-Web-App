package com.hoadd.onlinemarket.interfaces;

import com.hoadd.onlinemarket.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
