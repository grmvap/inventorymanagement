package com.example.inventorymanagement.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Min;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDTO {
    @Column(length = 100)
    private String name;
    @Column(length = 250)
    private String description;
    @Min(value = 0)
    private BigDecimal price;
}
