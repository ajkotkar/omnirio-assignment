package com.ominiro.catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ominiro.catalog.entity.Category;
import com.ominiro.catalog.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public ResponseEntity<String> addCategory(Category category) {
		try{			
			categoryRepository.save(category);
			return ResponseEntity.ok("Category Added Successfully.");
		}catch(Exception e){
			
		}
		return ResponseEntity.ok("Something went wrong while saving category.");	
	}

}
