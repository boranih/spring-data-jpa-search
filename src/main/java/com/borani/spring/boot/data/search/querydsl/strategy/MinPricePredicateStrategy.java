package com.borani.spring.boot.data.search.querydsl.strategy;

import com.borani.spring.boot.data.search.dto.ProductSearchCriteria;
import com.borani.spring.boot.data.search.entity.Product;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.Expressions;
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
    public BooleanExpression build(ProductSearchCriteria searchCriteria) {
        return Expressions.TRUE;
    }
}
