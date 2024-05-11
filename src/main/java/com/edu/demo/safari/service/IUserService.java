package com.edu.demo.safari.service;

import com.edu.demo.safari.dto.UserDto;
import com.edu.demo.safari.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {

    User addUser(User user);
    List<User>getAllUser();

    List<UserDto>getUserByLanguage(String ln);
}
