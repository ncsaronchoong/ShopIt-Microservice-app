package com.shopit.productmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopit.productmicroservice.entity.Product;

public interface ProductRepository extends JpaRepository <Product, Integer>{
	

}
