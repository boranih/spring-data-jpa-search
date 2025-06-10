package com.borani.spring.boot.data.search.querydsl.strategy;

import com.borani.spring.boot.data.search.dto.ProductSearchCriteria;
import com.borani.spring.boot.data.search.entity.Product;
import com.querydsl.core.types.dsl.BooleanExpression;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.util.Optional;

public interface SearchStrategy {

    SearchStrategyType getType();

    BooleanExpression build(String value);
}
