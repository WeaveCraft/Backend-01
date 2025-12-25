package com.hurtigpayes.holistiQ.transaction.dto;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hurtigpayes.holistiQ.account.entity.Account;
import com.hurtigpayes.holistiQ.enums.TransactionStatus;
import com.hurtigpayes.holistiQ.enums.TransactionType;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionDTO {

    private Long id;

    private BigDecimal amount;

    private TransactionType transactionType;

    private LocalDateTime transactionDate;

    private String description;

    private TransactionStatus status;

    @JsonBackReference
    private Account account;

    private String sourceAccount;
    private String destinationAccount;
}
