package com.tyler.ninjasanddojos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tyler.ninjasanddojos.services.DojoService;
import com.tyler.ninjasanddojos.services.NinjasService;

@Controller
public class HomeController {

	private final DojoService dojoServ;
	private final NinjasService ninjaServ;
	
	public HomeController(DojoService dojoServ, NinjasService ninjaServ) {
		this.dojoServ = dojoServ;
		this.ninjaServ = ninjaServ;
	}
	
	@GetMapping("/")
	public String index() {
		return "main/dashboard.jsp";
	}
	
	
}
