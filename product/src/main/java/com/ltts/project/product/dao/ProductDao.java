package com.ltts.project.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltts.project.product.model.Product;

public interface ProductDao extends JpaRepository<Product, Long>{

}
