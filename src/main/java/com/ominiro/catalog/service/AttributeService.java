package com.ominiro.catalog.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ominiro.catalog.entity.Attribute;


public interface AttributeService {

	ResponseEntity<String> addAttribute(Attribute attribute);

	List<Attribute> getAttributesByCategoryId(String categoryId);

}
