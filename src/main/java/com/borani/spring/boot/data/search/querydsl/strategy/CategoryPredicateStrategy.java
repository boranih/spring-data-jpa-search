package com.borani.spring.boot.data.search.querydsl.strategy;

import com.borani.spring.boot.data.search.dto.ProductSearchCriteria;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.Expressions;
import org.springframework.stereotype.Component;

@Component
public class CategoryPredicateStrategy implements SearchStrategy {

    @Override
    public SearchStrategyType getType() {
        return SearchStrategyType.CATEGORY;
    }

    @Override
    public BooleanExpression build(ProductSearchCriteria searchCriteria) {
        return Expressions.TRUE;
    }
}
