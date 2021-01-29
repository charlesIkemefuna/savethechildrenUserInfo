package com.saveTheChildren.UserInformation.controller;

import com.saveTheChildren.UserInformation.model.User;
import com.saveTheChildren.UserInformation.service.UserService;
import com.saveTheChildren.encryption.Cryptable;
import com.saveTheChildren.encryption.UserDataEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/userinfo")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        Cryptable userDataEncryptor = new UserDataEncryptor();
        userDataEncryptor.userInformationTransformer(user);
        User transformedUser = user;
        return userService.save(transformedUser);
    }

    @GetMapping("/user")
    public Iterable<User> read(){
        return userService.findAll();
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Integer id){
         userService.deleteById(id);
    }



}
