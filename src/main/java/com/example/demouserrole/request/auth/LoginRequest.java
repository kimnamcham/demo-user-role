package com.example.demouserrole.request.auth;

import lombok.Data;

@Data
public class LoginRequest {
    private String userName;
    private String password;
}
