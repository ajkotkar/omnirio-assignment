package com.ominiro.catalog.service;

import org.springframework.http.ResponseEntity;

import com.ominiro.catalog.entity.Category;

public interface CategoryService {

	ResponseEntity<String> addCategory(Category category);

}
