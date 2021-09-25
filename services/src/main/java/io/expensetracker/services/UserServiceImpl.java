package io.expensetracker.services;

import io.expensetracker.dto.UserDto;
import io.expensetracker.model.user.MyUser;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserServices {


    private final ModelMapper modelMapper;

    public UserServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public void creatUser(UserDto user) {
        modelMapper.map(user, MyUser.class);
    }
}
