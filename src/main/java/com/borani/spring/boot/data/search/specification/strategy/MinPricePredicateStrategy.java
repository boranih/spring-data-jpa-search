package com.borani.spring.boot.data.search.specification.strategy;

import com.borani.spring.boot.data.search.dto.ProductSearchCriteria;
import com.borani.spring.boot.data.search.entity.Product;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MinPricePredicateStrategy implements SearchStrategy {

    @Override
    public SearchStrategyType getType() {
        return SearchStrategyType.MIN_PRICE;
    }

    @Override
    public Optional<Predicate> build(Root<Product> root, CriteriaBuilder cb, ProductSearchCriteria dto) {
        Double price = dto.minPrice();
        return (price != null && price > 0)
                ? Optional.of(cb.greaterThan(root.get("price"), price))
                : Optional.empty();
    }
}
