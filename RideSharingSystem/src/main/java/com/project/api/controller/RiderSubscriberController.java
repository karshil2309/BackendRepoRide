package com.project.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.model.RiderSubscriberModel;
import com.project.api.service.RiderSubscriberService;


@RestController
@RequestMapping("/subscriberide")
public class RiderSubscriberController {

	
		@Autowired
		private RiderSubscriberService ridersubscriberservice;
		
		@GetMapping("/ridedetails")
		public List<RiderSubscriberModel> get(){
			return ridersubscriberservice.get();
		}
//		@GetMapping("/employees")
//		public String getEmployees(Model model, String keyword) {	
//			
//			model.addAttribute("RiderSubscriberModel", ridersubscriberservice.get());		
//		  
//
//			return "records";
//		}	
		
		@GetMapping("/ridedetails/{subscribeid}")
		public RiderSubscriberModel get(@PathVariable Integer subscribeid) {
			RiderSubscriberModel ridesubscribemodel =   ridersubscriberservice.get(subscribeid);
			if(ridesubscribemodel == null) {
				throw new RuntimeException("Ride with id "+subscribeid+" is not found !");
			}
			return ridesubscribemodel;
		}
		
		@PostMapping("/ridedetailsform")
		public RiderSubscriberModel save(@RequestBody RiderSubscriberModel ridersubscribermodel) {
			ridersubscriberservice.save(ridersubscribermodel);
			return ridersubscribermodel;
		}
		

		@DeleteMapping("/unsubscriberride/{subscribeid}")
		public String delete(@PathVariable Integer subscribeid) {
			 ridersubscriberservice.delete(subscribeid);
			 return "Ride Suceesfully Unsubscribed with ID :  "+subscribeid;
		}
		
		@PutMapping("/updateridedetails")
		public RiderSubscriberModel update(@RequestBody RiderSubscriberModel ridesubscribemodel) {
			ridersubscriberservice.save(ridesubscribemodel);
			return ridesubscribemodel;
		}
	

}
