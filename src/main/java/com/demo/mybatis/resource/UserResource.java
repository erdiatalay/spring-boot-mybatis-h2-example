package com.demo.mybatis.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.mybatis.mapper.UserMapper;
import com.demo.mybatis.model.User;

@RestController
@RequestMapping("api/users")
public class UserResource
{
    @Autowired
    private UserMapper userMapper;

    @GetMapping("all")
    public List<User> getAll()
    {
        return userMapper.findAll();
    }

    @GetMapping("update")
    public List<User> update()
    {
        return userMapper.findAll();
    }
}
