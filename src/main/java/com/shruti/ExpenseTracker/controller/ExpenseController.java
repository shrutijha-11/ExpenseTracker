package com.shruti.ExpenseTracker.controller;

import org.springframework.ui.Model;
import com.shruti.ExpenseTracker.model.Expense;
import com.shruti.ExpenseTracker.server.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/")
    public String ViewHomepage(Model model){
        List<Expense> expense = expenseService.getAllExpenses();
        BigDecimal totalAmount = expense.stream().map(Expense::getTotal).reduce(BigDecimal.ZERO,BigDecimal::add);
        model.addAttribute("expenses",expense);
        model.addAttribute("totalAmount",totalAmount);
        return "index";
    }

    @GetMapping("/addExpense")
    public String showAddExpense(Model model){
        Expense expense = new Expense();
        model.addAttribute("expense",expense);
        return "addExpense";
    }

    @PostMapping("/saveExpense")
    public String saveExpense(@ModelAttribute("expense")Expense expense){
        expenseService.saveExpense(expense);
        return "redirect:/";
    }

    @GetMapping("editExpense/{id}")
    public String showUpdateExpensePage(@PathVariable Long id, Model model){
        Expense expense = expenseService.getExpenseById(id);
        model.addAttribute("expense",expense);
        return "updateExpense";
    }

    @PostMapping("/updateExpense/{id}")
    public String updateExpense(@PathVariable Long id, @ModelAttribute("expense")Expense expense){
        Expense existingExpense = expenseService.getExpenseById(id);
        existingExpense.setDescription(expense.getDescription());
        existingExpense.setTotal(expense.getTotal());
        expenseService.saveExpense(existingExpense);
        return  "redirect:/";
    }

    @GetMapping("/deleteExpense/{id}")
    public String deleteExpense(@PathVariable Long id){
        expenseService.deleteExpenseById(id);
        return "redirect:/";
    }
}
