package com.project.api.repository;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.api.model.RideDetailsModel;




//extends JpaRepository<RideDetailsModel, Integer> 
@Repository
public interface RideDetailsDao {

	List<RideDetailsModel> get();
	 
	void save(RideDetailsModel ridedetailsmodel);
	
	void delete(Integer rid);
}