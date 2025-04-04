package com.example.inventorymanagement.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDTO {
    @Max(value = 100)
    private String name;
    @Max(value = 250, message = "Превышено допустимое количество символов")
    private String description;
    @Min(value = 0)
    private BigDecimal price;
}
