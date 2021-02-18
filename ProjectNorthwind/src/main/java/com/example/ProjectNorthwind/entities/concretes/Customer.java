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
@Table(name = "customers")


public class Customer implements IEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private String customerId;
	@Column(name = "contact_name")
	private String contactName;
	@Column (name = "address")
	private String address;
	@Column(name ="company_name")
	private String companyName;
	

}
