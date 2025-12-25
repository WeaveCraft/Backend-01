package com.hurtigpayes.holistiQ.transaction.repository;

import com.hurtigpayes.holistiQ.account.entity.Account;
import com.hurtigpayes.holistiQ.transaction.entity.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    Page<Transaction> findByAccount_AccountNumber(String accountNumber, Pageable pageable);

    List<Transaction> findByAccount_AccountNumber(String accountNumber);

    List<Transaction> findByAccount(Account account);
}
