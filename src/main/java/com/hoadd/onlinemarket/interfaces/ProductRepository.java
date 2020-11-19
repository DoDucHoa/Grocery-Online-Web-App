package com.hoadd.onlinemarket.interfaces;

import com.hoadd.onlinemarket.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
