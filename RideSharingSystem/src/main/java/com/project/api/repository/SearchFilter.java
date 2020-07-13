package com.project.api.repository;

//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
//import org.springframework.cglib.core.Predicate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
//import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.project.api.model.SearchFilterModel;

public interface SearchFilter extends JpaRepository<SearchFilterModel, Integer>, JpaSpecificationExecutor<SearchFilterModel>{

	
}

