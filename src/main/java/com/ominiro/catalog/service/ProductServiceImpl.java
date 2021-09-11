package com.ominiro.catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ominiro.catalog.entity.Product;
import com.ominiro.catalog.repository.AttributeRepository;
import com.ominiro.catalog.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private AttributeRepository attributeRepository;
	
	@Override
	public ResponseEntity<String> addProduct(Product product) {
		try{			
			productRepository.save(product);
			return ResponseEntity.ok("Product Added Successfully.");
		}catch(Exception e){
			
		}
		return ResponseEntity.ok("Something went wrong while saving product.");	
	}

	@Override
	public Product getProductById(String productId) {
		Product product = productRepository.findByProductId(productId);
		product.setProductAttributes(attributeRepository.findByCategoryId(product.getCategoryId()));
		return product;
	}
	

}
