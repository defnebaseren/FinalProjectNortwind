package com.example.ProjectNorthwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.ProjectNorthwind.entities.abstracts.IEntity;

import lombok.Data;

@Data
@Entity
@Table(name = "products")

public class Product implements IEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int productId;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "quantity_per_unit")
	private String quantityPerUnit;
	@Column(name = "category_id")
	private int categoryId;
	@Column(name = "unit_price")
	private double unitPrice;
	@Column(name = "discontinued")
	private int discontinued;
	
	
}
