package com.expense.project.service;

import com.expense.project.entity.Expenses;
import java.util.List;


public interface ExpenseService {
    List<Expenses> getAllExpenses();

    Expenses getExpenseById(Long id);

    Expenses saveExpense(Expenses expense);

    Expenses updateExpense(Long id, Expenses expense);

    void deleteExpense(Long id);


}
