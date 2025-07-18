package com.ex.restaurent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ex.restaurent.entity.Menu;
import com.ex.restaurent.service.MenuService;



@Controller
	public class MenuController {
	    @Autowired private MenuService service;

	    @GetMapping("/menu")
	    public String list(Model model) {
	        model.addAttribute("menus", service.getAll());
	        return "menu";
	    }

	    @GetMapping("/menu/add")
	    public String addForm(Model model) {
	        model.addAttribute("menu", new Menu());
	        return "add_menu";
	    }

	    @PostMapping("/menu/save")
	    public String save(@ModelAttribute Menu menu) {
	        service.save(menu);
	        return "redirect:/menu";
	    }

	    @GetMapping("/menu/delete/{id}")
	    public String delete(@PathVariable Long id) {
	        service.delete(id);
	        return "redirect:/menu";
	    }
	}

