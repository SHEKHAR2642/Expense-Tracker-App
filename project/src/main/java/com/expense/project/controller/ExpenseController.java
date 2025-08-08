package com.expense.project.controller;

import com.expense.project.entity.Expenses;
import com.expense.project.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@CrossOrigin(origins = "*")
public class ExpenseController {

    private ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService){
        this.expenseService=expenseService;
    }

    @GetMapping
    public List<Expenses> getAllExpenses(){
        return expenseService.getAllExpenses();
    }

    @GetMapping("/{id}")
    public Expenses getExpenseById(@PathVariable Long id){
        return expenseService.getExpenseById(id);
    }

    @PostMapping
    public Expenses createExpense(@RequestBody Expenses expense){
        return expenseService.saveExpense(expense);
    }

    @PutMapping("/{id}")
    public Expenses updateExpense(@PathVariable Long id, @RequestBody Expenses expense){
        return expenseService.updateExpense(id,expense);
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable long id){
        expenseService.deleteExpense(id);
    }


}
