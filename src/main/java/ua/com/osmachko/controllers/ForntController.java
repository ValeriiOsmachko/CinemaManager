package ua.com.osmachko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.osmachko.entities.User;
import ua.com.osmachko.services.UserService;

import java.util.List;

/**
 * Created by Valerii_Osmachko on 4/20/2017.
 */
@RestController
public class ForntController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
       List<User> users = userService.getAll();
       return new ResponseEntity(users, HttpStatus.OK);
    }
}
