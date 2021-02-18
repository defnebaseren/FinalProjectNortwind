package com.example.ProjectNorthwind.dal.concretes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjectNorthwind.entities.concretes.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart , Integer> {

}
