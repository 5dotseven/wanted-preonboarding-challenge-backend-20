package com.example.wanted_6.domain.product.controller;

import com.example.wanted_6.domain.product.dto.request.ProductSaveRequestDto;
import com.example.wanted_6.domain.product.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "제품", description = "제품")
@RequestMapping("/api/products")
@RequiredArgsConstructor
@RestController
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @Operation(summary = "제품 생성", description = "제품 생성")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "성공", content = @Content(schema = @Schema(implementation = Long.class)))})
    public ResponseEntity<Long> saveProduct(ProductSaveRequestDto requestDto) {
        Long saved = productService.saveProduct(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
