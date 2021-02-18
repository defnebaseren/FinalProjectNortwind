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
@Table(name = "order_details")



public class OrderDetails implements IEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int productId;
	@Column(name = "order_id")
	private int orderId;
	@Column(name = "unit_price")
	private double unitPrice;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "discount")
	private double discount;
}
