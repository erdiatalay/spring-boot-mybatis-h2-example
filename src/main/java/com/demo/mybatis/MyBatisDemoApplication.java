package com.demo.mybatis;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.demo.mybatis.model.User;

@MappedTypes(User.class)
@MapperScan("com.demo.mybatis.mapper")
@SpringBootApplication
public class MyBatisDemoApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(MyBatisDemoApplication.class, args);
    }
}
