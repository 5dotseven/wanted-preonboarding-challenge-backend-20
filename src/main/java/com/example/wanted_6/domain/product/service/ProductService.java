package com.example.wanted_6.domain.product.service;

import com.example.wanted_6.domain.product.dto.request.ProductSaveRequestDto;
import com.example.wanted_6.domain.product.dto.response.ProductDetailResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Long saveProduct(ProductSaveRequestDto productSaveRequestDto);

//    Page<ProductDetailResponseDto> findProductDetail(Pageable pageable);
}
