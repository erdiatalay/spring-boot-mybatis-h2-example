package com.demo.mybatis.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping(value = "id/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Integer id)
    {
        return userMapper.findById(id);
    }

    @RequestMapping(value = "id/{id}", method = RequestMethod.DELETE)
    public Integer removeUser(@PathVariable Integer id)
    {
        return userMapper.deleteById(id);
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public Integer insertUser(@RequestParam String name, @RequestParam Long salary, @RequestParam String email)
    {
        User user = new User(name, email, salary);
        return userMapper.insert(user);
    }

    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public Integer update(@RequestParam Integer id, @RequestParam String name, @RequestParam Long salary,
            @RequestParam String email)
    {
        User user = new User(id, name, email, salary);
        return userMapper.update(user);
    }
}
