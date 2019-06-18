package com.stackroute.UserAuthentication.service;


import com.stackroute.UserAuthentication.domain.User;
import com.stackroute.UserAuthentication.exceptions.UserAlreadyExistsException;

import java.util.List;

public interface UserService
{
    User saveUser(User user) throws UserAlreadyExistsException; //users ADDED

    List<User> getAllUsers();  ///RETRIEVE users

    User findByUserIdAndPassword(String username, String password);
}
