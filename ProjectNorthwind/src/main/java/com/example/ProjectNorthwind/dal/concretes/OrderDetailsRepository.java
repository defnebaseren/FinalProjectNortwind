package com.example.ProjectNorthwind.dal.concretes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjectNorthwind.entities.concretes.OrderDetails;


public interface OrderDetailsRepository extends JpaRepository<OrderDetails ,Integer> {

}
