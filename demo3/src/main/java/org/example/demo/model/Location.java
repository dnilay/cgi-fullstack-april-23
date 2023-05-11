package org.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Location {
	
	private int locationId;
	private String city;
	private String country;
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", city=" + city + ", country=" + country + "]";
	}
	
	

}
