package com.example2.Service.Impl;

import com.example2.Entity.User;
import com.example2.Mapper.UserMapper;
import com.example2.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

;import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUsers() {
//        log.info("/queryAllUsers start...");
        return userMapper.queryAllUsers();
    }
}

