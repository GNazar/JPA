package com.example.sp.service;

import com.example.sp.dto.ProductDto;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public ProductDto findById(Long id) {
        ProductDto productDto = new ProductDto();
        productDto.setId(id);
        productDto.setName("Product " + id);
        productDto.setDescription("Description " + id);
        return productDto;
    }
}
