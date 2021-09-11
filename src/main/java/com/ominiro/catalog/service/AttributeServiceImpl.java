package com.ominiro.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ominiro.catalog.entity.Attribute;
import com.ominiro.catalog.repository.AttributeRepository;

@Service
public class AttributeServiceImpl implements AttributeService {

	@Autowired
	private AttributeRepository attributeRepository;

	@Override
	public ResponseEntity<String> addAttribute(Attribute attribute) {
		try {
			attributeRepository.save(attribute);
			return ResponseEntity.ok("Attribute Added Successfully.");
		} catch (Exception e) {

		}
		return ResponseEntity
				.ok("Something went wrong while saving attribute.");
	}

	@Override
	public List<Attribute> getAttributesByCategoryId(String categoryId) {
		return attributeRepository.findByCategoryId(categoryId);
	}

}
