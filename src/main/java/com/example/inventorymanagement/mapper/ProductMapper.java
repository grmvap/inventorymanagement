package com.example.inventorymanagement.mapper;

import com.example.inventorymanagement.dto.ProductDTO;
import com.example.inventorymanagement.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toProduct(ProductDTO productDTO);
    ProductDTO toProductDTO(Product product);
    List<ProductDTO> toProductDTOList(List<Product> productList);
}
