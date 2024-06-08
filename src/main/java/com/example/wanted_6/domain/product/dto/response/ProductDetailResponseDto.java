package com.example.wanted_6.domain.product.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDetailResponseDto {
    private Long id;
    private String name;
    private Integer price;
}
