package org.example.repository;

import org.example.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryTransaction extends JpaRepository<Transaction, Long>{}