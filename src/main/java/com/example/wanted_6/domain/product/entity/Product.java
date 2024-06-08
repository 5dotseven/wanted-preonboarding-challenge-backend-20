package com.example.wanted_6.domain.product.entity;

import com.example.wanted_6.domain.common.BaseEntity;
import com.example.wanted_6.domain.product.dto.response.ProductDetailResponseDto;
import com.example.wanted_6.domain.productstatus.entity.ProductStatus;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@Entity
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer price;

    @ManyToOne
    private ProductStatus productStatus;

    private Integer quantity;

//    public ProductDetailResponseDto toDto(Product product) {
//        ProductDetailResponseDto.builder()
//                .id(product.getId())
//                .name(product.getName())
//                .price(product.getPrice())
//                .
//    }
}
