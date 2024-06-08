package com.example.wanted_6.domain.productstatus.service;

import com.example.wanted_6.domain.productstatus.dto.request.ProductStatusSaveRequestDto;

public interface ProductStatusService {
    Long saveProductStatus(ProductStatusSaveRequestDto productStatusSaveRequestDto);
}
