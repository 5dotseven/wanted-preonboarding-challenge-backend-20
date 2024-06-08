package com.example.wanted_6.domain.productstatus.controller;

import com.example.wanted_6.domain.productstatus.dto.request.ProductStatusSaveRequestDto;
import com.example.wanted_6.domain.productstatus.service.ProductStatusService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Tag(name = "제품 상태(판매중, 예약중, 완료)", description = "제품 상태(판매중, 예약중, 완료)")
@RequestMapping("/api/product-statues")
@RequiredArgsConstructor
@RestController
public class ProductStatusController {
    private final ProductStatusService productStatusService;

    @PostMapping
    @Operation(summary = "제품 상태 생성", description = "제품 상태 생성")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "성공", content = @Content(schema = @Schema(implementation = Long.class)))})
    public ResponseEntity<Long> saveProductStatus(@RequestBody ProductStatusSaveRequestDto productStatusSaveRequestDto) {
        log.info("requestDto = {}", productStatusSaveRequestDto.getName());
        Long saved = productStatusService.saveProductStatus(productStatusSaveRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
