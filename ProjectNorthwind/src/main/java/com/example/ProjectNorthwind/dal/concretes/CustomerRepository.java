package com.example.ProjectNorthwind.dal.concretes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjectNorthwind.entities.concretes.Customer;


public interface CustomerRepository extends JpaRepository<Customer , String> {


}
