package com.hurtigpayes.holistiQ.account.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hurtigpayes.holistiQ.auth_user.dto.UserDTO;
import com.hurtigpayes.holistiQ.auth_user.entity.User;
import com.hurtigpayes.holistiQ.enums.AccountStatus;
import com.hurtigpayes.holistiQ.enums.AccountType;
import com.hurtigpayes.holistiQ.enums.Currency;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
    private Long id;

    private String accountNumber;

    private BigDecimal balance;

    private AccountType accountType;

    @JsonBackReference
    private UserDTO user;

    private Currency currency;

    private AccountStatus status;

    @JsonManagedReference
    private List<TransactionDTO> transactions;

    private LocalDateTime closedAt;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
