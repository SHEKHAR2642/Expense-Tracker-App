package com.expense.project.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="expenses")
public class Expenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment in MySQL
    private Long id;
    @Column
    private String title;
    @Column
    private String category;
    @Column
    private double amount;
    @Column
    private LocalDate date;
    @Column
    private String notes;
}
