package io.expensetracker.services;

import io.expensetracker.dto.AuthRequest;
import io.expensetracker.dto.UserDto;
import io.expensetracker.model.user.MyUser;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserServices {


    private final ModelMapper modelMapper;

    private final AuthenticationManager authenticationManager;

    public UserServiceImpl(ModelMapper modelMapper, AuthenticationManager authenticationManager) {
        this.modelMapper = modelMapper;
        this.authenticationManager = authenticationManager;
    }

    @Override
    public void creatUser(UserDto user) {
        modelMapper.map(user, MyUser.class);
    }

    @Override
    public void login(AuthRequest authRequest) {

    }
}
