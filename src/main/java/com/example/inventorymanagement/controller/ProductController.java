package com.example.inventorymanagement.controller;

import com.example.inventorymanagement.dto.ProductDTO;
import com.example.inventorymanagement.mapper.ProductMapper;
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
    private final ProductMapper productMapper;

    @PostMapping("/inventory")
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO) {
        Product product = productMapper.toProduct(productDTO);
        Product createdProduct = productService.createProduct(product);
        return productMapper.toProductDTO(createdProduct);
    }

    @GetMapping("/get/all")
    public List<ProductDTO> getAllProducts() {
        return productMapper.toProductDTOList(productService.getAllProducts());
    }

    @GetMapping("/get")
    public ProductDTO getProduct(@RequestParam Long id) {
        return productMapper.toProductDTO(productService.getProductById(id));
    }

    @PutMapping("/update")
    public ProductDTO updateProduct(@RequestBody ProductDTO productDTO) {
        Product product = productMapper.toProduct(productDTO);
        Product updateProduct = productService.updateProduct(product.getId(), productDTO.getName());
        return productMapper.toProductDTO(updateProduct);
    }

    @DeleteMapping("/delete")
    public void deleteProduct(@RequestParam Long id) {
        productService.deleteProduct(id);
    }
}
