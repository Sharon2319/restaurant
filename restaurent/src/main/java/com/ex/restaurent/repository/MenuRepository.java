package com.ex.restaurent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.restaurent.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {}
