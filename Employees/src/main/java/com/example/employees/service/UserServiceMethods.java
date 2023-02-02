package com.example.employees.service;

import com.example.employees.entity.Users;

import java.util.List;

public interface UserServiceMethods {
    public List<Users> getAllUsers();
    public Users getUserbyId(int userId);

    public Users addOrUpdateUser(Users user);

    public Users deleteUser(int userId) throws Exception;



}
