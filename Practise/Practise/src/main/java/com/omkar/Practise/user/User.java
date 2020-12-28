package com.omkar.Practise.user;


import java.util.Date;

public class User {
    private int Id;

    private String name;

    private Date birthDate;

    protected User(){

    }

    public User(int id, String name, Date birthDate) {
        this.Id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
