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
@Table(name = "shopping_cart")

public class ShoppingCart implements IEntity{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id")
	public Iterable<Integer> cartId;
	@Column(name = "customer_id")
	public String customerId;
	@Column(name = "product_id")
	public int productId;
	@Column(name = "quantity")
	public int quantity;
	@Column(name = "order_id")
	public int orderId;
}


