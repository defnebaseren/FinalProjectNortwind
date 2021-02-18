package com.example.ProjectNorthwind.dal.concretes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjectNorthwind.entities.concretes.Product;

public interface ProductRepository extends JpaRepository<Product , Integer> {

}
