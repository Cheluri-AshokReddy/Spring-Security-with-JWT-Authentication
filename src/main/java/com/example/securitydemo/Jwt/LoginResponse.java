package com.example.securitydemo.Jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    private String jwtToken;
    private String username;
    private List<String> roles;

    public LoginResponse(String username, List<String> roles,String jwtToken) {
        this.jwtToken = jwtToken;
        this.username = username;
        this.roles = roles;
    }
}
