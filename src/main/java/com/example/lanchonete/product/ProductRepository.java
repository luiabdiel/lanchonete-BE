package com.example.lanchonete.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    record ProductRequestDTO(String title, String image, Integer price) {
    }
}
