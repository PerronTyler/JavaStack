package com.tyler.savetravels.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyler.savetravels.models.Expense;
import com.tyler.savetravels.services.ExpenseService;

@Controller
@RequestMapping("/expenses")
public class ExpenseController {
	
	public final ExpenseService expenseServ;

	public ExpenseController(ExpenseService expenseServ) {
		this.expenseServ = expenseServ;
	}
	@GetMapping("/all")
	public String allDonations(Model model, @ModelAttribute("expense") Expense expense) {
		model.addAttribute("allExpenses", expenseServ.getAll());
		
		return "ShowAll.jsp";
		
	}
	@GetMapping("/one/{id}")
	public String oneExpense(@PathVariable("id") Long id, Model model) {
		Expense oneExpense = expenseServ.findOne(id);
		model.addAttribute("oneExpense", oneExpense);
		return "oneExpense.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editExpense(@PathVariable("id") Long id, Model model) {
		Expense expense = expenseServ.findOne(id);
		model.addAttribute("expense", expense);
		return "edit.jsp";
	}
	
	@PutMapping("/edit/process/{id}")
	public String processEditExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		expenseServ.update(expense);
		return "redirect:/expenses/all";
	}
	
	@PostMapping("/process")
	public String processExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if(result.hasErrors()) {
			return "ShowAll.jsp";
		}
		expenseServ.create(expense);
		return "redirect:/expenses/all";
	}
	@DeleteMapping("/{id}")
	public String processDelete(@PathVariable("id") Long id, Model model) {
		expenseServ.deleteById(id);
		return "redirect:/expenses/all";
	}
}
