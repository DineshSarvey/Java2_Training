package com.iiht.training.eloan.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProcessingDto {
	
	@NotNull
	@Size(min = 1, message = "Acres of Land cannot be 0")
	private Double acresOfLand;
	
	@NotNull
	@Size(min = 1, message = "Land value cannot be 0")
	private Double landValue;
	private String appraisedBy;
	private String valuationDate;
	
	@NotNull
	@Size(min=3,max=150, message="Address of Property should be atleast 3 and max 150 characters")
	private String addressOfProperty;
	
	@NotNull
	@Size(min = 1, message = "Land value should be greater than 0")
	private Double suggestedAmountOfLoan;
	public Double getAcresOfLand() {
		return acresOfLand;
	}
	public void setAcresOfLand(Double acresOfLand) {
		this.acresOfLand = acresOfLand;
	}
	public Double getLandValue() {
		return landValue;
	}
	public void setLandValue(Double landValue) {
		this.landValue = landValue;
	}
	public String getAppraisedBy() {
		return appraisedBy;
	}
	public void setAppraisedBy(String appraisedBy) {
		this.appraisedBy = appraisedBy;
	}
	public String getValuationDate() {
		return valuationDate;
	}
	public void setValuationDate(String valuationDate) {
		this.valuationDate = valuationDate;
	}
	public String getAddressOfProperty() {
		return addressOfProperty;
	}
	public void setAddressOfProperty(String addressOfProperty) {
		this.addressOfProperty = addressOfProperty;
	}
	public Double getSuggestedAmountOfLoan() {
		return suggestedAmountOfLoan;
	}
	public void setSuggestedAmountOfLoan(Double suggestedAmountOfLoan) {
		this.suggestedAmountOfLoan = suggestedAmountOfLoan;
	}
	
	
}