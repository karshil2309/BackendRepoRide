package com.project.api.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

import lombok.Data;

@Data
@Entity
@Table(name = "cars")
public class SearchFilterModel {

	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    private String color;

	    private String model;

	    @Column(name="creationyear")
	    private Integer creationyear;

	    private String brand;

	    private Integer price;

	    @JoinColumn(name="options_id")
	    @OneToOne
	    private OptionsModel options;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public Integer getCreationyear() {
			return creationyear;
		}

		public void setCreationyear(Integer creationyear) {
			this.creationyear = creationyear;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public Integer getPrice() {
			return price;
		}

		public void setPrice(Integer price) {
			this.price = price;
		}

		public OptionsModel getOptions() {
			return options;
		}

		public void setOptions(OptionsModel options) {
			this.options = options;
		}


	
}