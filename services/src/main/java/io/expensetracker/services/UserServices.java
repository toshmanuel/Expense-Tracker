package io.expensetracker.services;

import io.expensetracker.dto.AuthRequest;
import io.expensetracker.dto.UserDto;

public interface UserServices {
    void creatUser(UserDto user);

    public void login(AuthRequest authRequest);

}
