package io.expensetracker.dto;

import io.expensetracker.model.user.Role;
import lombok.Data;

@Data
public class UserDto {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String username;
    private Role roles;

}
