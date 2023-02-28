package com.example.springvalentine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springvalentine.model.Valentine;
import com.example.springvalentine.repository.ValentineRepository;

@Controller
public class ValentineController {

	@Autowired
	ValentineRepository valentineRepository;

	@RequestMapping("/")
	public String show(Model x)
	{
		x.addAttribute("valentine",new Valentine());
		return "form";
	}
	@RequestMapping("/valentineInfo")
	public String userinformation(@ModelAttribute("valentine") Valentine valentine)
	{
			valentineRepository.save(valentine);
		   return "valentineInfo";
	}
}