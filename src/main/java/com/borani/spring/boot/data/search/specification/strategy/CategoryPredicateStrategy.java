package com.borani.spring.boot.data.search.specification.strategy;

import com.borani.spring.boot.data.search.dto.ProductSearchCriteria;
import com.borani.spring.boot.data.search.entity.Product;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CategoryPredicateStrategy implements SearchStrategy {
    @Override
    public SearchStrategyType getType() {
        return SearchStrategyType.CATEGORY;
    }

    @Override
    public Optional<Predicate> build(Root<Product> root, CriteriaBuilder cb, ProductSearchCriteria dto) {
        String category = dto.category();
        return (category != null && !category.isEmpty())
                ? Optional.of(cb.equal(root.get("category"), category))
                : Optional.empty();
    }
}
