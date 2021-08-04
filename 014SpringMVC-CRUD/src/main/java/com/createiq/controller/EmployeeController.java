package com.createiq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.createiq.model.Employee;
import com.createiq.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/addEmp")
	public String addEmp() {
		return "addEmp";
	}

	@RequestMapping(value = "/saveEmp", method = RequestMethod.POST)
	public String saveEmp(Employee employee) {
		System.out.println("Employee : " + employee);
		employeeService.add(employee);
		return "redirect:/findAll";
	}

	@RequestMapping(value = "/findAll")
	public ModelAndView findAll() {
		return new ModelAndView("findAll", "employees", employeeService.findAll());
	}
	
	@RequestMapping("/updateEmp")
	public String updateEmp(@RequestParam("eid") Integer eid,Model model) {
		Employee employee = employeeService.findByID(eid);
		model.addAttribute("employee", employee);
		return "updateEmp";
	}
	
	
	@RequestMapping("/deleteEmp")
	public String deleteEmp(@RequestParam("eid") Integer eid,Model model) {
		employeeService.delete(eid);
		return "redirect:/findAll";
	}
	
	
	@RequestMapping(value = "/updateEmp", method = RequestMethod.POST)
	public String updateEmp(Employee employee) {
		employeeService.update(employee);
		return "redirect:/findAll";
	}

}
