package com.project.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.model.RateRideModel;
import com.project.api.service.RateRideService;


@RestController
@RequestMapping("/rateride")
public class RateRideController {

	
		@Autowired
		private RateRideService raterideservice;
		
		@GetMapping("/rateinfo")
		public List<RateRideModel> get(){
			return raterideservice.get();
		}
		
		@GetMapping("/raterideid/{rateid}")
		public RateRideModel get(@PathVariable Integer rateid) {
			RateRideModel rateridemodel =   raterideservice.get(rateid);
			if(rateridemodel == null) {
				throw new RuntimeException("Rate ID with id "+rateid+" is not found !");
			}
			return rateridemodel;
		}
		
		@PostMapping("/submitride")
		public RateRideModel save(@RequestBody RateRideModel rateridemodel) {
			raterideservice.save(rateridemodel);
			return rateridemodel;
		}
		

		@DeleteMapping("/deleterate/{rateid}")
		public String delete(@PathVariable Integer rateid) {
			 raterideservice.delete(rateid);
			 return "Rating Suceesfully delete with ID :  "+rateid;
		}
		
		@PutMapping("/updaterating")
		public RateRideModel update(@RequestBody RateRideModel rateridemodel) {
			raterideservice.save(rateridemodel);
			return rateridemodel;
		}
	

}
