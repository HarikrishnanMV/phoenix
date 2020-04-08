package com.pharma.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="billdetails")

public class Bill {

	@Id
	@Column(name="billNo")
    private int billNo;
	
	@Column(name="billDate")
	@NotEmpty(message="Bill Date cannot be null")
    private String billDate;
	
	@Column(name="medId")
    private int id;
	
	
	@Column(name="medName")
	@NotEmpty(message="medicine name cannot be null")
    private String medName;
	
	@Column(name="manufacComp")
	@NotEmpty(message="Company name cannot be null")
    private String manufacComp;
	
	@Column(name="units")
    private int units;
	
	@Column(name="pricepu")
    private int pricepu;

	@Column(name="tax")
    private int tax;
	
	@Column(name="total")
    private  int total;
	
	public Bill() {}
	public Bill(int billNo,String billDate,int id, String medName,String manufacComp,int units,int pricepu,int tax,int total)
	{
		this.billNo=billNo;
		this.billDate=billDate;
		this.id=id;
		this.medName=medName;
		this.manufacComp=manufacComp;
		this.units=units;
		this.pricepu=pricepu;
		this.tax=tax;
		this.total=total;
		
	}
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public String getBillDate() {
		return billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMedName() {
		return medName;
	}
	public void setMedName(String medName) {
		this.medName = medName;
	}
	public String getManufacComp() {
		return manufacComp;
	}
	public void setManufacComp(String manufacComp) {
		this.manufacComp = manufacComp;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public int getPricepu() {
		return pricepu;
	}
	public void setPricepu(int pricepu) {
		this.pricepu = pricepu;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() 
	{
		return "Bill [Bill  No.= "+ billNo +",Bill Date= "+ billDate + ",Medicine Id="+ id + ",Medicine Name = "+medName+",Company name ="+manufacComp+",units = "+units+", Price per Unit= "+pricepu+
				",Tax = "+tax+",Total = "+total+"]";
	}
}
