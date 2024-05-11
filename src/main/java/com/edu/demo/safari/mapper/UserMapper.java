package com.edu.demo.safari.mapper;

import com.edu.demo.safari.dto.UserDto;
import com.edu.demo.safari.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDto mapToUserDtoLn(User user,String ln)
    {
        return UserDto.builder()
                .userID(user.getUserID())
                .firstname(user.getFirstname().getContent().get(ln))
                .lastname(user.getLastname().getContent().get(ln))
                .email(user.getEmail())
                .mobile(user.getMobile())
                .build();
    }
}
