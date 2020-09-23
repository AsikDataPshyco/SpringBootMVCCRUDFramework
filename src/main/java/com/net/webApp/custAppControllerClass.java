package com.net.webApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class custAppControllerClass {

	@Autowired
	private custDataAccessObjectClass cDAO;
	
	@RequestMapping("/")
	
	//method to show the HomePage
	
	public String custHomePage(Model model) {
		
		List<saleDomainModelClass> lstCustomer = cDAO.list();		
		model.addAttribute("lstCustomer", lstCustomer);		
		System.out.println(lstCustomer);
		return "index";
		
	}
	
	@RequestMapping("/new")
	
	public String createNewEmployee(Model model) {
		
		saleDomainModelClass empData = new saleDomainModelClass();
		model.addAttribute("empData", empData);
		
				
		return "newemployee";
	}
}
