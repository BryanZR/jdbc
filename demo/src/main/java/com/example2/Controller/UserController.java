package com.example2.Controller;

import com.example2.Entity.User;
import com.example2.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/web")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/queryAllUsers")
    public List<User> queryAllUsers(){
        return userService.queryAllUsers();
    }
}