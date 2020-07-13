package com.project.api.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.project.api.model.DriverLoginModel;
//import com.project.api.model.RegistrationModel;
import com.project.api.model.RideDetailsModel;
//import com.project.api.model.RiderSubscriberModel;
import com.project.api.repository.PaginationSortDao;
//import com.project.api.service.DriverLoginServiceImpl;
import com.project.api.service.RideDetailsServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/rideCall")
public class RideDetailsController {
	@Autowired	
	private RideDetailsServiceImpl ridedetailsserviceimpl;
	
	@Autowired
	private PaginationSortDao paginationsortdao;

	@GetMapping("/ridedetails")
	public List<RideDetailsModel> get(){
		return ridedetailsserviceimpl.get();
	}

	@PostMapping("/ridedetailsform")
	public RideDetailsModel save(@RequestBody RideDetailsModel ridedetailsmodel) {
		ridedetailsserviceimpl.save(ridedetailsmodel);
		return ridedetailsmodel;
	}
	@DeleteMapping("/unsubscriberride/{rid}")
	public String delete(@PathVariable Integer rid) {
		 ridedetailsserviceimpl.delete(rid);
		 return "Ride Suceesfully Unsubscribed with ID :  "+rid;
	}
	
	@PutMapping("/updateridedetails")
	public RideDetailsModel update(@RequestBody RideDetailsModel ridedetailsmodel) {
		ridedetailsserviceimpl.save(ridedetailsmodel);
		return ridedetailsmodel;
	}
	
	@GetMapping("/listPageable")
	Page<RideDetailsModel> ridedetailsPageable(Pageable pageable){
		return paginationsortdao.findAll(pageable);
		
	}
	
}
	
	
	
//	@Autowired	
//	private DriverLoginServiceImpl driverloginserviceimpl;


	
	
//	@GetMapping("/rides")
//	public String getStates(Model model) {		
//		List<RideDetailsModel> stateList = ridedetailsserviceimpl.getRides();	
//		model.addAttribute("rides", stateList);	
//
//		List<DriverLoginModel> countryList = driverloginserviceimpl.get();	
//		model.addAttribute("countries", countryList);
//		
//		return "State" ;
//	}	
//	
//	@PostMapping("/rides/addNew")
//	public String addNew(RideDetailsModel ridedetailsmodel) {
//		ridedetailsserviceimpl.save(ridedetailsmodel);
//		return "redirect:/rides";
//	}
//	
//	@RequestMapping("rides/findById")
//	@ResponseBody
//	public Optional<RideDetailsModel> findById(Integer rid) {
//	  return ridedetailsserviceimpl.findById(rid);	
//	}	
//	
//	@RequestMapping(value="/rides/update", method= {RequestMethod.PUT, RequestMethod.GET})
//	public String update(RideDetailsModel ridedetailsmodel) {
//		ridedetailsserviceimpl.save(ridedetailsmodel);
//		return "redirect:/rides";
//	}
//	
//	@RequestMapping(value="/rides/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
//	public String delete(Integer rid) {
//		ridedetailsserviceimpl.delete(rid);
//		return "redirect:/rides";
//	}

