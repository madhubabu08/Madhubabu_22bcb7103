package com.expensetracker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "expenses")
public class Expense {
    @Id
    private String id;
    private String title;
    private double amount;
    private String date;

    // Constructors
    public Expense() {}

    public Expense(String title, double amount, String date) {
        this.title = title;
        this.amount = amount;
        this.date = date;
    }

    public void setId(String id) {
    }

    // Getters and Setters
    // ... (You can use Lombok if preferred)
}
