package com.pharma.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.pharma.entities.Admin;

@Controller
public class LoginController 
{
	@RequestMapping("/")
	  public String displayWelcomePage(){
	  	return "welcome" ;
	  }
	  @RequestMapping("/success")
	  public String login(@ModelAttribute("admin") Admin adm) {
		if((adm.getUsername().equals("admin")) &&(adm.getPassword().equals("admin")))
	      {
	    	  return "secondpage";
	      }
	    else
	      {
	    	  return "loginfailed";
	      }
		  
	  }
}
