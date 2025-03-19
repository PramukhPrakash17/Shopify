package com.pramukh.shoppingapplication.productservice.DTO;

import java.math.BigDecimal;

public record ProductResponseDto(String id, String name, String description, BigDecimal price) {
}
