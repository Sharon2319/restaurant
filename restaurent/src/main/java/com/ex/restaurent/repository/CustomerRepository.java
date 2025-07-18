package com.ex.restaurent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.restaurent.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}