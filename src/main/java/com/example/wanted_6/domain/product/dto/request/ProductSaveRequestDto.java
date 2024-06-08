package com.example.wanted_6.domain.product.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductSaveRequestDto {
    private String name;
    private Integer price;
    private Integer quantity;
    private Long ProductStatusId;
}
