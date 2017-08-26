package com.egit.spring.shoppingcart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "OrderDetails")
public class OrderDetails {

	
	@Id
    private String _id;

	public String fullName;
	public String addrs1;
	public String addrs2;
	public String city;
	public String region;
	public String pinCode;
	public String country;
	private String cardNmbr;
	private String monYr;
	private String scrtyPin;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddrs1() {
		return addrs1;
	}
	public void setAddrs1(String addrs1) {
		this.addrs1 = addrs1;
	}
	public String getAddrs2() {
		return addrs2;
	}
	public void setAddrs2(String addrs2) {
		this.addrs2 = addrs2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCardNmbr() {
		return cardNmbr;
	}
	public void setCardNmbr(String cardNmbr) {
		this.cardNmbr = cardNmbr;
	}
	public String getMonYr() {
		return monYr;
	}
	public void setMonYr(String monYr) {
		this.monYr = monYr;
	}
	public String getScrtyPin() {
		return scrtyPin;
	}
	public void setScrtyPin(String scrtyPin) {
		this.scrtyPin = scrtyPin;
	}
	
	
	
	
}
