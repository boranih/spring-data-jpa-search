package com.borani.spring.boot.data.search.querydsl.strategy;

import com.borani.spring.boot.data.search.dto.ProductSearchCriteria;
import com.borani.spring.boot.data.search.entity.Product;
import com.querydsl.core.types.dsl.BooleanExpression;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class ProductSearchStrategy {

    private final List<SearchStrategy> searchStrategies;

    private final Map<SearchStrategyType, SearchStrategy> strategyMap;

    public ProductSearchStrategy(List<SearchStrategy> strategies) {
        this.searchStrategies = strategies;
        this.strategyMap = strategies.stream()
                .collect(Collectors.toMap(SearchStrategy::getType, Function.identity()));
    }

    public void buildPredicate(ProductSearchCriteria dto) {
    }
}
