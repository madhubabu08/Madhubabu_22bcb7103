package com.expensetracker.expense_tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;

    @GetMapping
    public List<com.expensetracker.model.Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    @PostMapping
    public com.expensetracker.model.Expense createExpense(@RequestBody com.expensetracker.model.Expense expense) {
        return expenseRepository.save(expense);
    }

    @DeleteMapping("/{id}")
    public String deleteExpense(@PathVariable String id) {
        expenseRepository.deleteById(id);
        return "Expense with ID " + id + " deleted successfully.";
    }

    @PutMapping("/{id}")
    public com.expensetracker.model.Expense updateExpense(@PathVariable String id, @RequestBody com.expensetracker.model.Expense updatedExpense) {
        updatedExpense.setId(id);
        return expenseRepository.save(updatedExpense);
    }
}
