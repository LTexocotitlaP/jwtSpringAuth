package org.example.controller;

import org.example.domain.Transaction;
import org.example.repository.RepositoryTransaction;

import org.springframework.beans.factory.annotation.Autowired;  // <<<<<< Aquí el import
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class ControllerTransaction {

    @Autowired
    private RepositoryTransaction repositoryTransaction;

    @PostMapping
    public Transaction crearTransaccion(@RequestBody Transaction transaction) {
        return repositoryTransaction.save(transaction);
    }
}
