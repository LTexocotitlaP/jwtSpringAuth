package org.example.controller;

import org.example.model.Transaction;
import org.example.repository.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transaction")
public class TransactionController {

    @Autowired
    private TransactionRepository repository;

    @PostMapping
    public Transaction createTransaccion(@RequestBody Transaction transaction) {
        return repository.save(transaction);
    }
}
