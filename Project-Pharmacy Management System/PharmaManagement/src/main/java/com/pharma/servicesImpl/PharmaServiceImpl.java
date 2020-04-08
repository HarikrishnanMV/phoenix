package com.pharma.servicesImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pharma.dao.MedicineDAO;
import com.pharma.entities.Medicine;
import com.pharma.services.PharmaService;
import com.pharma.entities.Medicine2;
import com.pharma.entities.Medicine3;
import com.pharma.entities.Bill;

@Service
public class PharmaServiceImpl implements PharmaService 
{
	@Autowired
	MedicineDAO medicineDao;
	
	@Override
	@Transactional
	public List<Medicine> getAllMedicine() 
	{
		
		return medicineDao.getAllMedicine();
	}
	
	@Override
	@Transactional
	public List<Bill> getAllBill() 
	{
		
		return medicineDao.getAllBill();
	}

	@Override
	@Transactional
	public Medicine getMedicine(int id) 
	{   
		return medicineDao.getMedicine(id);
	}
	
	@Override
	@Transactional
	public void deleteMedicine(int id) 
	{
		medicineDao.deleteMedicine(id);
	}
	
	@Override
	@Transactional
	public void saveMedicine(Medicine med) 
	{
		medicineDao.saveMedicine(med);
		
	}
	
	@Override
	@Transactional
	public void saveBill(Bill b) 
	{
		medicineDao.saveBill(b);
		
	}
	

	@Override
	@Transactional
	public Medicine searchMedicine1(int id) 
	{
		return medicineDao.searchMedicine1(id);
	}
	
	@Override
	@Transactional
	public Medicine2 searchMedicine2(String medName) 
	{
		return medicineDao.searchMedicine2(medName);
	}
	
	@Override
	@Transactional
	public Medicine3 searchMedicine3(String manufacComp) 
	{
		return medicineDao.searchMedicine3(manufacComp);
	}
}