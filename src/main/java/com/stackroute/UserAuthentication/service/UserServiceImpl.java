package com.stackroute.UserAuthentication.service;


import com.stackroute.UserAuthentication.domain.User;
import com.stackroute.UserAuthentication.exceptions.UserAlreadyExistsException;
import com.stackroute.UserAuthentication.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepo;

    @Autowired
    public UserServiceImpl(UserRepository repo) {
        this.userRepo = repo;
    }


    @Override
    public User findByUserIdAndPassword(String username, String password) {
        return userRepo.findByNameAndPassword(username, password);
    }


    @Override
    public User saveUser(User user) throws UserAlreadyExistsException {
        if(userRepo.existsByName(user.getName())){
            throw new UserAlreadyExistsException();
        }
        else
            return userRepo.save(user);

    }


    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }



}
