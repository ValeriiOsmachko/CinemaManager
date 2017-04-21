package ua.com.osmachko.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.osmachko.dao.UserRepository;
import ua.com.osmachko.entities.User;
import ua.com.osmachko.services.UserService;

import java.util.List;

/**
 * Created by Valerii_Osmachko on 4/7/2017.
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public void remove(User user) {
        userRepository.delete(user);
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean isUserExists(User user) {
        User us = userRepository.findOne(user.getId().toString());
        if(us != null) {
             return true;
        }
        return false;
    }


}
