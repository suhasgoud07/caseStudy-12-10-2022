package com.gl.GlobalExchangeCentre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.GlobalExchangeCentre.bean.CompanyShare;
import com.gl.GlobalExchangeCentre.service.GlobalService;




@RestController
public class ShareController {
	@Autowired
	private  GlobalService service;
	
	@GetMapping("/index")
	public ModelAndView showIndexPage() {
		ModelAndView mv = new ModelAndView("index");
		List<CompanyShare> companyList = service.findAll();
		mv.addObject("companyList",companyList);
		return mv;
	}
	
	@GetMapping("/companyEntry")
	public ModelAndView showEntryPage() {
		CompanyShare global = new CompanyShare();
		ModelAndView mv = new ModelAndView("companyEntryPage");
		mv.addObject("companyRecord",global);
		return mv;
	}
	
	@PostMapping("/companyShare")
	public ModelAndView saveNewCourse(@ModelAttribute("companyRecord") CompanyShare global) {
		long id = service.generateCompanyId(); 
		global.setCompanyId(id);
		service.save(global);
		return new ModelAndView("redirect:/index");
	}
	
	
	@GetMapping("/delete/{id}")
	public ModelAndView deleteCompany(@PathVariable long id) {
		 service.delete(id);
		ModelAndView mv4 = new ModelAndView("redirect:/index");
		return mv4;
	}

	@GetMapping("/edit-company/{id}")
	public ModelAndView showCompanyEditPage(@PathVariable long id) {
		CompanyShare global =service.findById(id);
		ModelAndView mv=new ModelAndView("companyShareUpdation");
		mv.addObject("companyRecord",global);
		return mv;
	}
	@PostMapping("/edit-company/company-edit")
	public ModelAndView editCompany(@ModelAttribute("companyRecord") CompanyShare global) {
	
		service.save(global);	
		return new ModelAndView("redirect:/index");
		
	}
	
}


