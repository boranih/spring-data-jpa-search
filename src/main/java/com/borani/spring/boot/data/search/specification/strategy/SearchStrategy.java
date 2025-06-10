package com.borani.spring.boot.data.search.specification.strategy;

import com.borani.spring.boot.data.search.dto.ProductSearchCriteria;
import com.borani.spring.boot.data.search.entity.Product;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.util.Optional;

public interface SearchStrategy {

    SearchStrategyType getType();

    Optional<Predicate> build(Root<Product> root, CriteriaBuilder cb, ProductSearchCriteria dto);

}
