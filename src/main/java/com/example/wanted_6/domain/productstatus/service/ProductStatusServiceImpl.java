package com.example.wanted_6.domain.productstatus.service;

import com.example.wanted_6.domain.productstatus.dto.request.ProductStatusSaveRequestDto;
import com.example.wanted_6.domain.productstatus.entity.ProductStatus;
import com.example.wanted_6.domain.productstatus.repository.ProductStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductStatusServiceImpl implements ProductStatusService {
    private final ProductStatusRepository productStatusRepository;

    @Override
    public Long saveProductStatus(ProductStatusSaveRequestDto productStatusSaveRequestDto) {
        ProductStatus save = productStatusRepository.save(
                ProductStatus.builder()
                        .name(productStatusSaveRequestDto.getName())
                        .build()
        );
        return save.getId();
    }
}
