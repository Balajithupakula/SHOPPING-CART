package com.example.SHOPPING_CART.repository;

import com.example.SHOPPING_CART.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}

