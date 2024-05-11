package com.edu.demo.safari.controllers;

import com.edu.demo.safari.dto.UserDto;
import com.edu.demo.safari.entities.User;
import com.edu.demo.safari.service.IUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/")
    User saveUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }

    @GetMapping("/")
    List<User> getAllUser()
    {
        return userService.getAllUser();
    }

    @GetMapping("/{ln}")
    List<UserDto> getAllUserByLanguage(@PathVariable String ln)
    {
        return userService.getUserByLanguage(ln);
    }
}
