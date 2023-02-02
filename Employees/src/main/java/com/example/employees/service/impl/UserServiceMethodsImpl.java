package com.example.employees.service.impl;

import com.example.employees.entity.Users;
import com.example.employees.repository.UserRepository;
import com.example.employees.service.UserServiceMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceMethodsImpl implements UserServiceMethods {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<Users> getAllUsers() {
        return (List<Users>) userRepository.findAll();
    }

    @Override
    public Users getUserbyId(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public Users addOrUpdateUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users deleteUser(int userId) throws Exception {
        Users deleteUser = null;
        try{
            deleteUser = userRepository.findById(userId).orElse(null);
            if(deleteUser!=null){
                userRepository.delete(deleteUser);
            }

        }
        catch (Exception ex){
            throw ex;
        }
        return deleteUser;
    }
}
