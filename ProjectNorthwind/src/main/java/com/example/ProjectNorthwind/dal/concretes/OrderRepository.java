package com.example.ProjectNorthwind.dal.concretes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjectNorthwind.entities.concretes.Orders;

public interface OrderRepository extends JpaRepository<Orders , Integer> {

}
