package com.ominiro.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.ominiro.catalog.entity.Attribute;
import com.ominiro.catalog.entity.Category;
import com.ominiro.catalog.entity.Product;
import com.ominiro.catalog.service.AttributeService;
import com.ominiro.catalog.service.CategoryService;
import com.ominiro.catalog.service.ProductService;

@RestController
public class CatalogController {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	@Autowired
	private AttributeService attributeService;
	
	
	@PostMapping("/addCategory")
	public ResponseEntity<String> addCategory(@RequestBody Category category){
		return categoryService.addCategory(category);
		
	}
	
	@PostMapping("/addAttribute")
	public ResponseEntity<String> addAttribute(@RequestBody Attribute attribute ){
		return attributeService.addAttribute(attribute);
		
	}
	
	@PostMapping("/addProduct")
	public ResponseEntity<String> addProduct(@RequestBody Product product ){
		return productService.addProduct(product);
		
	}
	
	@GetMapping("/product/{productId}")
	public Product getProductById(@PathVariable String productId){
		return productService.getProductById(productId);
	}
	
	@GetMapping("/attributes/{categoryId}")
	public List<Attribute> getAttributesByCategoryId(@PathVariable String categoryId){
		return attributeService.getAttributesByCategoryId(categoryId);
	}
}
