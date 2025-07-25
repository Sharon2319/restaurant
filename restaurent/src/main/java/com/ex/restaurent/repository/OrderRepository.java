package com.ex.restaurent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.restaurent.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}