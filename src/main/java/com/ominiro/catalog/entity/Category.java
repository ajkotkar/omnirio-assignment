package com.ominiro.catalog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "category")
public class Category {

	@Id
	@Column(name="category_id")
	private String categoryId;
	
	@Column(name="category_name")
	private String categoryName;
}
