package com.example.inventorymanagement.controller;

import com.example.inventorymanagement.model.Product;
import com.example.inventorymanagement.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/inventory")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/get/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/get")
    public Product getProduct(@RequestParam Long id) {
        return productService.getProductById(id);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Long id, @RequestBody String name) {
        return productService.updateProduct(id, name);
    }

    @DeleteMapping("/delete")
    public void deleteProduct(@RequestParam Long id) {
        productService.deleteProduct(id);
    }
}
