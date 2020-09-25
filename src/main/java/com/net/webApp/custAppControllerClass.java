package com.net.webApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


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
	
	@RequestMapping(value = "/save" , method = RequestMethod.POST)
	public String insertRow(@ModelAttribute("empData") saleDomainModelClass empData) {
		
		cDAO.insertRow(empData);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{ID}")	
	public ModelAndView showEditForm(@PathVariable(name = "ID") int ID ){
	    ModelAndView mav = new ModelAndView("edit_form");
	    saleDomainModelClass getemployeeId = cDAO.get(ID);	    
	    mav.addObject("getemployeeId", getemployeeId);
	 
	    return mav;
	   
	}

}
