package com.jsp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.User;
import com.jsp.service.Service;

@Controller
public class controller {
	@Autowired
	Service i;
	@Autowired
	User u;

	@PostMapping("/save")
	public String save(@ModelAttribute User u) {
		i.save(u);
		return "redirect:t";
	}
	@GetMapping("/t")
	public String get(Model m) {
		List<User> u=i.getAll() ;
		m.addAttribute("user", u);
		return  "index";
	}
	@PostMapping("/save/{id}")
	public String update(@PathVariable int id,@ModelAttribute("user") User u) {
		i.update(u,id);
		return "redirect:/t";
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		 i.delete(id);
		 return "redirect:/t";
	}
	
	@GetMapping("/new")
	public String add( Model m) {
		m.addAttribute("user", new User());
		return "add";
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		m.addAttribute("user", i.findById(id).get());
		return "update";
	}
	
	
}
