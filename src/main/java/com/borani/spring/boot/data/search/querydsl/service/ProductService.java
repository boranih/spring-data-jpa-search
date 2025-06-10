package com.borani.spring.boot.data.search.querydsl.service;

import com.borani.spring.boot.data.search.dto.ProductSearchCriteria;
import com.borani.spring.boot.data.search.entity.Product;
import com.borani.spring.boot.data.search.querydsl.repository.ProductRepository;
import com.borani.spring.boot.data.search.specification.strategy.ProductSearchStrategy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductSearchStrategy searchStrategy;

    public ProductService(ProductRepository productRepository, ProductSearchStrategy searchStrategy) {
        this.productRepository = productRepository;
        this.searchStrategy = searchStrategy;
    }

    public Page<Product> searchProducts(ProductSearchCriteria dto, Pageable pageable) {
        return productRepository.findAll((root, query, cb) ->
                searchStrategy.buildPredicate(root, cb, dto), pageable);
    }

}
