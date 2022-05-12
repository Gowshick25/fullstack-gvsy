package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private Product entity;
	@Autowired
	private ProductRepository repo;
	
	@RequestMapping(value = "/product",method = RequestMethod.GET)
	
	public String inItForm(Model model)
	{
		model.addAttribute("title","Add Products");
		model.addAttribute("command",entity);
		
		return "addProduct";
	}
	
	@RequestMapping(value = "/product",method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("command")Product entity) {
		try {
			this.repo.add(entity);
			return "success";
		} catch (Exception e) {
			return "failure";
		}}
	
	@RequestMapping(value="/product/srch",method=RequestMethod.GET)
	public String initsearchForm(Model model) {
		model.addAttribute("find", "searchproduct");
		return "searchproduct";
			
	}
	@RequestMapping(value="/product/srch",method=RequestMethod.POST)
	public String searchProduct(@RequestParam("id")int id,Model model) {
		Product entity= repo.findById(id);
		model.addAttribute("found", entity);
		return "showproduct";
			
	}
	@RequestMapping(value="/product/delete",method=RequestMethod.GET)
	public String delete(Model model) {
		model.addAttribute("findtodelete", "deleteproduct");
		return "deleteproduct";
			
	}
	@RequestMapping(value="/product/delete",method=RequestMethod.POST)
	public String deleteProduct(@RequestParam("id")int id,Model model) {
		int entity= repo.remove(id);
		model.addAttribute("found", entity);
		return "showproduct";
			
	}
	@RequestMapping(value="/product/update",method=RequestMethod.GET)
	public String update(Model model) {
		model.addAttribute("update","Update Products");
		model.addAttribute("command",entity);
		return "updateproduct";
			
	}
	@RequestMapping(value="/product/update",method=RequestMethod.POST)
	public String updateProduct(@ModelAttribute("id")Product id,Model model) {
		int entity= repo.update(id);
		model.addAttribute("found", entity);
		return "showproduct";
			
	}
	
}
	  