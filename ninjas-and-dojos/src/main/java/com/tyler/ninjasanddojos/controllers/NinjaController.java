package com.tyler.ninjasanddojos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyler.ninjasanddojos.models.Dojo;
import com.tyler.ninjasanddojos.models.Ninja;
import com.tyler.ninjasanddojos.services.DojoService;
import com.tyler.ninjasanddojos.services.NinjasService;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
	private final NinjasService ninjaServ;
	private final DojoService dojoServ;
	public NinjaController(NinjasService ninjaServ, DojoService dojoServ) {
		this.ninjaServ = ninjaServ;
		this.dojoServ = dojoServ;
		// TODO Auto-generated constructor stub
	}
	@GetMapping("/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoServ.getAll();
		model.addAttribute("dojos", dojos);
		return "main/create.jsp";
	}
	@PostMapping("/process")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, Model model, BindingResult result) {
		if(result.hasErrors()) {
			List<Dojo> dojos = dojoServ.getAll();
			model.addAttribute("dojos", dojos);
			return "main/create.jsp";
		} else {
			ninjaServ.create(ninja);
			return "main/dashboard.jsp";
		}
	}

}
