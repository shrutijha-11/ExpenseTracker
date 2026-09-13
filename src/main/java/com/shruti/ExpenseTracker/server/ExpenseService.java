package com.shruti.ExpenseTracker.server;

import com.shruti.ExpenseTracker.model.Expense;
import com.shruti.ExpenseTracker.repository.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepo expenseRepo;
    public List<Expense> getAllExpenses(){
        return expenseRepo.findAll();
    }
    public void saveExpense(Expense expense){
        expenseRepo.save(expense);
    }
    public Expense getExpenseById(Long id){
        return expenseRepo.findById(id).orElse(null);
    }
    public void deleteExpenseById(Long id){
        expenseRepo.deleteById(id);
    }
}
