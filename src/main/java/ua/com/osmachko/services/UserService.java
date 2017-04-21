package ua.com.osmachko.services;

import ua.com.osmachko.entities.User;

import java.util.List;

/**
 * Created by Valerii_Osmachko on 4/7/2017.
 */
public interface UserService {

    void save(User user);

    void remove(User user);

    User getUserByEmail(String email);

    List<User> getAll();

    boolean isUserExists(User user);
}
