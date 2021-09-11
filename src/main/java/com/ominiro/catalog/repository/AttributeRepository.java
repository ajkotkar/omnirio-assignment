package com.ominiro.catalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ominiro.catalog.entity.Attribute;


public interface AttributeRepository extends JpaRepository<Attribute, Integer>{

	List<Attribute> findByCategoryId(String categoryId);

}
