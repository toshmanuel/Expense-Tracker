package io.expensetracker.dto;

import lombok.Data;

@Data
public class AuthRequest {
    String username;
    String password;
}
