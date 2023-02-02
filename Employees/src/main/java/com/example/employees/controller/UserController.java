package com.example.employees.controller;

import com.example.employees.entity.Users;
import com.example.employees.service.UserServiceMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServiceMethods userServiceMethods;
    @GetMapping("/allUsers")
    public ResponseEntity<List<Users>> getAllUsers(){
    List<Users> users = null;
    try{
    users = userServiceMethods.getAllUsers();
    }
    catch(Exception ex){
        ex.getMessage();
    }
    return new ResponseEntity<List<Users>>(users,HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Users> getById(@PathVariable int userId){
        Users users = null;
        try{
            users = userServiceMethods.getUserbyId(userId);
        }
        catch(Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Users>(users,HttpStatus.OK);
    }

    @PostMapping("/addOrUpdate")
    public ResponseEntity<Users> getById(@RequestBody Users user){
        Users users = null;
        try{
            users = userServiceMethods.addOrUpdateUser(user);
        }
        catch(Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Users>(users,HttpStatus.OK);
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<Users> deleteById(@PathVariable("id") int userId){
        Users users = null;
        try{
            users = userServiceMethods.deleteUser(userId);
        }
        catch(Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Users>(users,HttpStatus.OK);
    }

}
