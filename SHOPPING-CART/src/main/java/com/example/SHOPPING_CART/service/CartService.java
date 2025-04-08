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
    public CartItem updateCartItem(Long itemId, int quantity) {
        CartItem item = cartItemRepo.findById(itemId)
                .orElseThrow(() -> new RuntimeException("Cart item not found"));
        item.setQuantity(quantity);
        return cartItemRepo.save(item);
    }
    public CartItem addToCart(Long productId, int quantity) {
        Product product = productRepo.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        CartItem item = new CartItem();
        item.setProduct(product);
        item.setQuantity(quantity);
        return cartItemRepo.save(item);
    }
    public Product updateProduct(Long productId, Product updatedProduct) {
        Product existingProduct = productRepo.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        existingProduct.setName(updatedProduct.getName());
        existingProduct.setPrice(updatedProduct.getPrice());
        return productRepo.save(existingProduct);
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

    public void removeProductFromCart(Long productId) {
        List<CartItem> cartItems = cartItemRepo.findByProductId(productId);
        cartItemRepo.deleteAll(cartItems);
        productRepo.deleteById(productId);
    }

    public void removeAllProducts() {
        cartItemRepo.deleteAll();
    }
}
