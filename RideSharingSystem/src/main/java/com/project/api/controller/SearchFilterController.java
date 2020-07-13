package com.project.api.controller;

import org.springframework.data.repository.*;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.cglib.core.Predicate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.model.SearchFilterModel;
import com.project.api.repository.SearchFilter;
import com.sipios.springsearch.anotation.SearchSpec;

import lombok.RequiredArgsConstructor;


@Controller
public class SearchFilterController {
	


	    private  SearchFilter searchfilter;

	    public SearchFilterController(SearchFilter searchfilter) {
	    	this.searchfilter=searchfilter;
	    }
	    @GetMapping("/cars")
	    public ResponseEntity<List<SearchFilterModel>> searchForCars(@SearchSpec Specification<SearchFilterModel> specs) {
	        return new ResponseEntity<>(searchfilter.findAll(Specification.where(specs)), HttpStatus.OK);
	    }
	    
	    
//	    @GetMapping
//	    public ResponseEntity getFiltered(
//	    		@QuerydslPredicate
//	    		(root = SearchFilterModel.class) 
//	    		Predicate predicate, Pageable pageable
//	    		)
//	    {
//	        return ResponseEntity.ok(personRepo);
//	    }
	


}
