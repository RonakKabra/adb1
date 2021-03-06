package com.verizon.tisp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cId;
	
	@NotEmpty(message="Please Select an Appropriate Service Plan")
	@Size(min=5,max=15,message="Service Plan  must be of 5 to 10 chars")
	private String sPlan;
	
	@NotEmpty(message="Name cannot be empty")
	@Size(min=5,max=15,message="lastName must be of 5 to 15 chars")
	private String Name;
	
	@DateTimeFormat(iso=ISO.DATE)
	@NotNull(message="Date of Request cannot be blank")
	@Column(name="dor")
	private LocalDate dateOfRequest;
	
	@NotEmpty(message="mobile no cannot be null")
	@Pattern(regexp="\\d{10}",message="mobile number can be only of 10 digits")
	@Column(name="mno")
	private String mobileNumber;

	@NotEmpty(message="Please Select a Time Slot")
	private String tSlot;
	
	@NotEmpty(message="Please Enter An Address")
	private String address;

	public String getsPlan() {
		return sPlan;
	}

	public void setsPlan(String sPlan) {
		this.sPlan = sPlan;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public LocalDate getDateOfRequest() {
		return dateOfRequest;
	}

	public void setDateOfRequest(LocalDate dateOfRequest) {
		this.dateOfRequest = dateOfRequest;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String gettSlot() {
		return tSlot;
	}

	public void settSlot(String tSlot) {
		this.tSlot = tSlot;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
	