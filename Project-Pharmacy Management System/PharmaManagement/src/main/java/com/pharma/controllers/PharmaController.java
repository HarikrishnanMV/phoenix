package com.pharma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import javax.validation.Valid;

import com.pharma.entities.Medicine;
import com.pharma.services.PharmaService;
import com.pharma.entities.Medicine2;
import com.pharma.entities.Medicine3;
import com.pharma.entities.Bill;

@Controller
public class PharmaController 
{
	@Autowired
	PharmaService pharmaservice;
	@RequestMapping("/list")
    public String listMedicine(Model theModel)
    {
		List<Medicine> medicine= pharmaservice.getAllMedicine();
		theModel.addAttribute("medicine",medicine);
		medicine.forEach(s -> System.out.println(s));
    	return "medicine-list";
    }
	
	@RequestMapping("/viewBill")
    public String listBill(Model theModel)
    {
		List<Bill> b= pharmaservice.getAllBill();
		theModel.addAttribute("bill",b);
		b.forEach(s -> System.out.println(s));
    	return "Bill-list";
    }
	
	@GetMapping("/addMedicine")
	public String addMedicine(Model model) {
		Medicine m1=new Medicine();
		model.addAttribute("medicine",m1);
		return "medicine-add-form";
	}
	
	@GetMapping("/bill")
	public String bill(Model model3) {
		Bill b=new Bill();
		model3.addAttribute("bill",b);
		return "bill-form";
	}
	
	@PostMapping("/saveMedicine")
	public String saveMedicine(@Valid @ModelAttribute("medicine") Medicine med,BindingResult bind)
	{
    	if(bind.hasErrors())
    	{
    		System.out.println(bind);
    		return "medicine-add-form";
    	}
    	else
    	{
    	   pharmaservice.saveMedicine(med);
		   return "secondpage";
    	}
	}
	
	@PostMapping("/saveBill")
	public String saveBill(@Valid @ModelAttribute("bill") Bill b1,@RequestParam("id") int id,BindingResult bind)
	{
    	if(bind.hasErrors())
    	{
    		System.out.println(bind);
    		return "bill-form";
    	}
    	else
    	{
    	   pharmaservice.saveBill(b1);
		   return "secondpage";
    	}
	}
	
	@GetMapping("/upMedicine")
	public String upMedicine(Model model1) 
	{
		List<Medicine> medicine= pharmaservice.getAllMedicine();
		model1.addAttribute("medicine",medicine);
		medicine.forEach(s -> System.out.println(s));
		return "medicine-update-list";
	}
	
	@GetMapping("/updateMedicine")
    public String updateMedicine(@RequestParam("medicineId") int id,Model model)
	{
		Medicine med=pharmaservice.getMedicine(id);
		model.addAttribute("medicine", med);
		return "medicine-update-form";
	}
	
	@GetMapping("/delMedicine")
	public String delMedicine(Model model2) 
	{
		List<Medicine> medicine= pharmaservice.getAllMedicine();
		model2.addAttribute("medicine",medicine);
		medicine.forEach(s -> System.out.println(s));
		return "medicine-delete-list";
	}
	
	@GetMapping("/deleteMedicine")
	public String delete(@RequestParam("medicineId") int id)
	{
		pharmaservice.deleteMedicine(id);
		return "secondpage";
	}
	
	
	 @GetMapping("/searchMedicine1")
	  	public String searchMedicine1(@RequestParam("medicineId") int id, Model model1)
	  	{
	    	Medicine med1=pharmaservice.searchMedicine1(id);
	      	model1.addAttribute("tempMedicines", med1);
	  		return "medicine-search-form1";
	  	}
	 

	 @GetMapping("/searchMedicine2")
	  	public String searchMedicine2(@RequestParam("medName") String medName, Model model2)
	  	{
	    	Medicine2 med2=pharmaservice.searchMedicine2(medName);
	      	model2.addAttribute("tempMedicines", med2);
	  		return "medicine-search-form2";
	  	}
	 

	 @GetMapping("/searchMedicine3")
	  	public String searchMedicine3(@RequestParam("manufacComp") String manufacComp, Model model3)
	  	{
	    	Medicine3 med3=pharmaservice.searchMedicine3(manufacComp);
	      	model3.addAttribute("tempMedicines", med3);
	  		return "medicine-search-form3";
	  	}
}
