package com.hurtigpayes.holistiQ.auth_user.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PasswordResetRequest {
    //Will be used to request for forgotten password.
    private String email;

    //Will be used to set new password.
    private String code;
    private String newPassword;
}
