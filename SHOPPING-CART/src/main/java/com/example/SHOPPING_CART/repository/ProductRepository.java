package com.example.SHOPPING_CART.repository;

import com.example.SHOPPING_CART.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
