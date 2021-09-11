package com.ominiro.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ominiro.catalog.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

	Product findByProductId(String productId);

}
