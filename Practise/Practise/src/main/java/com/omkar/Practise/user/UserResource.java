package com.omkar.Practise.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    @GetMapping("/users")
    public List<User> retrivedAllUsers(){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        return service.findOne(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user){
//        service.save(user);
        User savedUser = service.save(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable int id){
        User user = service.deleteBy(id);

        if (user==null){
            ;
        }
    }


}
