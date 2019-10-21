package com.demo.mybatis.model;

public class User
{
    private Integer id;
    private String name;
    private String emailId;
    private Long salary;

    public User()
    {
        // Default Empty Constructor
    }

    public User(Integer id, String name, String emailId, Long salary)
    {
        super();
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.salary = salary;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmailId()
    {
        return emailId;
    }

    public void setEmailId(String emailId)
    {
        this.emailId = emailId;
    }

    public Long getSalary()
    {
        return salary;
    }

    public void setSalary(Long salary)
    {
        this.salary = salary;
    }
}
