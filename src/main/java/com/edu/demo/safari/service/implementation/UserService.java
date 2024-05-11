package com.edu.demo.safari.service.implementation;

import com.edu.demo.safari.dto.UserDto;
import com.edu.demo.safari.entities.User;
import com.edu.demo.safari.mapper.UserMapper;
import com.edu.demo.safari.repositories.UserRepository;
import com.edu.demo.safari.service.IUserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService implements IUserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public List<UserDto> getUserByLanguage(String ln) {
        return userRepository.findAll().stream().map(user->this.userMapper.mapToUserDtoLn(user,ln)).toList();
    }
}
