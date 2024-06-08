package com.example.wanted_6.domain.productstatus.repository;

import com.example.wanted_6.domain.productstatus.entity.ProductStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductStatusRepository extends JpaRepository<ProductStatus, Long> {
}
