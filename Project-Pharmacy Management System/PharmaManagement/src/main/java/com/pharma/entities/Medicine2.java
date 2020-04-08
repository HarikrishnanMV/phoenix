package com.pharma.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="medicinedetails")

public class Medicine2 
{

	@Column(name="medId")
    private int id;
	
	@Id
	@Column(name="medName")
	@NotEmpty(message="medicine name cannot be null")
    private String medName;
	
	@Column(name="units")
	@NotEmpty(message="units cannot be null")
    private String units;
	
	@Column(name="pricepu")
	@NotEmpty(message="price per unit cannot be null")
    private String pricepu;
	
	@Column(name="manufacDate")
	@NotEmpty(message="Manufacturing Date cannot be null")
    private String manufacDate;
	
	@Column(name="expDate")
	@NotEmpty(message="Expiriy Date cannot be null")
    private String expDate;


	@Column(name="manufacComp")
	@NotEmpty(message="Company name cannot be null")
    private String manufacComp;
	
	public Medicine2() {}
	public Medicine2(int id, String medName,String units,String pricepu,String manufacDate,String expDate,String manufacComp)
	{
		this.id=id;
		this.medName=medName;
		this.units=units;
		this.pricepu=pricepu;
		this.manufacDate=manufacDate;
		this.expDate=expDate;
		this.manufacComp=manufacComp;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getMedName() 
	{
		return medName;
	}
	public void setMedName(String medName) 
	{
		this.medName = medName;
	}
	public String getUnits() 
	{
		return units;
	}
	public void setUnits(String units) 
	{
		this.units = units;
	}
	public String getPricepu() 
	{
		return pricepu;
	}
	public void setPricepu(String pricepu) 
	{
		this.pricepu = pricepu;
	}
	public String getManufacDate() 
	{
		return manufacDate;
	}
	public void setManufacDate(String manufacDate) 
	{
		this.manufacDate = manufacDate;
	}
	public String getExpDate() 
	{
		return expDate;
	}
	public void setExpDate(String expDate) 
	{
		this.expDate = expDate;
	}
	public String getManufacComp() 
	{
		return manufacComp;
	}
	public void setManufacComp(String manufacComp) 
	{
		this.manufacComp = manufacComp;
	}
	
	@Override
	public String toString() 
	{
		return "Medicine [id= "+ id + ",Medicine Name = "+medName+",units = "+units+", Price per Unit= "+pricepu+
				",Manufacturing Date = "+manufacDate+",Expiriy Date = "+expDate+",Company name ="+manufacComp+"]";
	}
}
