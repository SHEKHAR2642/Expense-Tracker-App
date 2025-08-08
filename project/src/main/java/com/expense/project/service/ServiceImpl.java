package com.expense.project.service;

import com.expense.project.entity.Expenses;
import com.expense.project.repository.ExpensesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ServiceImpl implements ExpenseService {

    private final ExpensesRepository expensesRepository;

    public ServiceImpl(ExpensesRepository expensesRepository) {
        this.expensesRepository = expensesRepository;
    }

    @Override
    public List<Expenses> getAllExpenses(){
        return expensesRepository.findAll();
    }

    @Override
    public Expenses getExpenseById(Long id){
        return expensesRepository.findById(id).orElseThrow(() -> new RuntimeException(("Expense not found")));
    }

    @Override
    public Expenses saveExpense(Expenses expense){
        return expensesRepository.save(expense);
    }

    @Override
    public Expenses updateExpense(Long id, Expenses expense){
        Expenses existingExpense=getExpenseById(id);
        existingExpense.setTitle((expense.getTitle()));
        existingExpense.setAmount(expense.getAmount());
        return expensesRepository.save(existingExpense);
    }

    @Override
    public void deleteExpense(Long id){
        expensesRepository.deleteById(id);
    }
}
