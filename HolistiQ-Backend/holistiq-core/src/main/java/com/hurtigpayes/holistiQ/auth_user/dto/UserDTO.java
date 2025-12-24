package com.hurtigpayes.holistiQ.auth_user.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hurtigpayes.holistiQ.account.dto.AccountDTO;
import com.hurtigpayes.holistiQ.role.entity.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {

    private Long Id;

    private String firstName; //CUSTOMER, AUDITOR, ADMIN (samples)
    private String lastName;
    private String phoneNumber;

    private String email;

    @JsonIgnore
    private String password;

    private String profilePictureUrl;
    private boolean active;

    private List<Role> roles;

    @JsonManagedReference
    private List<AccountDTO> accounts;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
