package com.pharma.dao;

import com.pharma.entities.Medicine;
import com.pharma.entities.Bill;
import java.util.List;
import com.pharma.entities.Medicine2;
import com.pharma.entities.Medicine3;

public interface MedicineDAO 
{

	public List<Medicine> getAllMedicine();
	public List<Bill> getAllBill();
	public Medicine getMedicine(int id);
	public void deleteMedicine(int id);
	public void saveMedicine(Medicine emp);
	public void saveBill(Bill b);
	public Medicine searchMedicine1(int id);
	public Medicine2 searchMedicine2(String medName);
	public Medicine3 searchMedicine3(String manufacComp);
}
