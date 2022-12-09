package com.tyler.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tyler.savetravels.models.Expense;
import com.tyler.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	
	private final ExpenseRepository expenseRepo;

	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;
	}
	
	public Expense create(Expense expense) {
		return expenseRepo.save(expense);
	}
	public List<Expense> getAll(){
		return expenseRepo.findAll();
	}
	public Expense findOne(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		}else {
			return null;	
		}
	}
	
	public Expense update(Long id, String name, String vendor,  long price, String description) {
		Expense expenseToBeUpdated = new Expense(id,name,vendor, price, description);
		return expenseRepo.save(expenseToBeUpdated);
	}
	public Expense update(Expense expense) {
		return expenseRepo.save(expense);
	}
	public String deleteById(Long id) {
		expenseRepo.deleteById(id);
		return "You have deleted the record with the id of: " + id;
	}
}
