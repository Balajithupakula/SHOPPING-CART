package com.example.SHOPPING_CART.service;

import com.example.SHOPPING_CART.model.CartItem;
import com.example.SHOPPING_CART.model.Product;
import com.example.SHOPPING_CART.repository.CartItemRepository;
import com.example.SHOPPING_CART.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private CartItemRepository cartItemRepo;

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public CartItem addToCart(Long productId, int quantity) {
        Product product = productRepo.findById(productId).orElseThrow();
        CartItem item = new CartItem();
        item.setProduct(product);
        item.setQuantity(quantity);
        return cartItemRepo.save(item);
    }

    public List<CartItem> getCartItems() {
        return cartItemRepo.findAll();
    }

    public void removeItem(Long itemId) {
        cartItemRepo.deleteById(itemId);
    }

    public void clearCart() {
        cartItemRepo.deleteAll();
    }
}

