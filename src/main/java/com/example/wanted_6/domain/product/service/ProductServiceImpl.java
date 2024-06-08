package com.example.wanted_6.domain.product.service;

import com.example.wanted_6.domain.product.dto.request.ProductSaveRequestDto;
import com.example.wanted_6.domain.product.dto.response.ProductDetailResponseDto;
import com.example.wanted_6.domain.product.entity.Product;
import com.example.wanted_6.domain.product.repository.ProductRepository;
import com.example.wanted_6.domain.productstatus.entity.ProductStatus;
import com.example.wanted_6.domain.productstatus.repository.ProductStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
    private final ProductStatusRepository productStatusRepository;

    @Override
    public Long saveProduct(ProductSaveRequestDto productSaveRequestDto) {
        ProductStatus productStatus = productStatusRepository.findById(productSaveRequestDto.getProductStatusId())
                .orElseThrow(() -> new IllegalArgumentException("해당 제품상태가 않습니다. id=" + productSaveRequestDto.getProductStatusId()));
        Product save = productRepository.save(
                Product.builder()
                        .name(productSaveRequestDto.getName())
                        .price(productSaveRequestDto.getPrice())
                        .quantity(productSaveRequestDto.getQuantity())
                        .productStatus(productStatus)
                        .build());
        return save.getId();
    }

//    @Override
//    public Page<ProductDetailResponseDto> findProductDetail(Pageable pageable) {
//        Page<Product> all = productRepository.findAll(pageable);
//        all.
//        return null;
//    }
}
