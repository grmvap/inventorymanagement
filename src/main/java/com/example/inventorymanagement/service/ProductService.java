package com.example.inventorymanagement.service;

import com.example.inventorymanagement.model.Product;

import java.util.List;

public interface ProductService {
     Product createProduct(Product product);
     List<Product> getAllProducts();
     Product getProductById(Long id);
     Product updateProduct(Long id, String name);
     void deleteProduct(Long id);
}
