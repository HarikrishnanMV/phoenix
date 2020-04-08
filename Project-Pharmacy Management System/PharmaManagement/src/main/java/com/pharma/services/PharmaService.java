package com.pharma.services;

import com.pharma.entities.Medicine;
import java.util.List;
import com.pharma.entities.Medicine2;
import com.pharma.entities.Medicine3;
import com.pharma.entities.Bill;

public interface PharmaService 
{
	public List<Medicine> getAllMedicine();
	public List<Bill> getAllBill();
	public Medicine getMedicine(int id);
	public void deleteMedicine(int id);
	public void saveMedicine(Medicine med);
	public void saveBill(Bill b);
	public Medicine searchMedicine1(int id);
	public Medicine2 searchMedicine2(String medName);
	public Medicine3 searchMedicine3(String manufacComp);
}