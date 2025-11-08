package com.udemy.telusko.springecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.telusko.springecom.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
