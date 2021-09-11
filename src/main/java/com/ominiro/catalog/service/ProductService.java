package com.ominiro.catalog.service;

import org.springframework.http.ResponseEntity;

import com.ominiro.catalog.entity.Product;

public interface ProductService {

	ResponseEntity<String> addProduct(Product product);

	Product getProductById(String productId);

}
