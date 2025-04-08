package com.example.SHOPPING_CART.controller;

import com.example.SHOPPING_CART.model.CartItem;
import com.example.SHOPPING_CART.model.Product;
import com.example.SHOPPING_CART.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CartController {

    @Autowired
    private CartService service;

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getAllProducts();
    }

    @PostMapping("/cart")
    public CartItem addToCart(@RequestParam Long productId, @RequestParam int quantity) {
        return service.addToCart(productId, quantity);
    }

    @GetMapping("/cart")
    public List<CartItem> getCartItems() {
        return service.getCartItems();
    }
    @PutMapping("/cart/{itemId}")
    public CartItem updateCartItem(@PathVariable Long itemId, @RequestParam int quantity) {
        return service.updateCartItem(itemId, quantity);
    }

    @DeleteMapping("/cart/{itemId}")
    public void removeItem(@PathVariable Long itemId) {
        service.removeItem(itemId);
    }

    @DeleteMapping("/cart")
    public void clearCart() {
        service.clearCart();
    }
}

