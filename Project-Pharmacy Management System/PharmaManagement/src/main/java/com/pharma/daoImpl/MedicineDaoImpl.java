package com.pharma.daoImpl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pharma.dao.MedicineDAO;
import com.pharma.entities.Medicine;
import com.pharma.entities.Medicine2;
import com.pharma.entities.Medicine3;
import com.pharma.entities.Bill;

@Repository
public class MedicineDaoImpl implements MedicineDAO
{
	@Autowired
	SessionFactory factory;
	SessionFactory factory1;

	@Override
	public List<Medicine> getAllMedicine() 
	{
	    Session session =factory.getCurrentSession();
	    Query<Medicine> query =session.createQuery("from Medicine",Medicine.class);
	    List<Medicine> medList=query.getResultList();
	    return medList;
	}
	
	@Override
	public List<Bill> getAllBill() 
	{
	    Session session =factory.getCurrentSession();
	    Query<Bill> query =session.createQuery("from Bill",Bill.class);
	    List<Bill> billList=query.getResultList();
	    return billList;
	}
	
	@Override
	public Medicine getMedicine(int id) 
	{
		Session session =factory.getCurrentSession();
		Medicine medicine=session.get(Medicine.class, id);
		return medicine;
	}

	@Override
	public void deleteMedicine(int id) 
	{
		Session session =factory.getCurrentSession();
		Medicine me=session.get(Medicine.class, id);
		session.delete(me);
		System.out.println("Deleted!");
	}
	
	@Override
	public void saveMedicine(Medicine med) 
	{
		Session session =factory.getCurrentSession();
		session.saveOrUpdate(med);
		System.out.println(med);
	}
	
	@Override
	public void saveBill(Bill b) 
	{
		Session session =factory.getCurrentSession();
		session.saveOrUpdate(b);
		System.out.println(b);
	}
	
	@Override
	public Medicine searchMedicine1(int id) {
		Session session =factory.getCurrentSession();
		Medicine medicine1=session.get(Medicine.class, id);
		return medicine1;
	}
	
	@Override
	public Medicine2 searchMedicine2(String medName) {
		Session session =factory.getCurrentSession();
		Medicine2 medicine2=session.get(Medicine2.class, medName);
		return medicine2;
	}
	
	@Override
	public Medicine3 searchMedicine3(String manufacComp) {
		Session session =factory.getCurrentSession();
		Medicine3 medicine3=session.get(Medicine3.class, manufacComp);
		return medicine3;
	}
}