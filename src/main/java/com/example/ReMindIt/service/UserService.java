package com.example.ReMindIt.service;

import com.example.ReMindIt.dao.UserDao;
import com.example.ReMindIt.model.Reminder;
import com.example.ReMindIt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class UserService {

    private UserDao userDao;
//    private RoleDao roleDao;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserDao userDao,
//                       RoleDao roleDao,
                       BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userDao = userDao;
//        this.roleDao = roleDao;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public User findUserByUserName(String username){
        return userDao.findUserByUsername(username);
    }

    // TODO: Save User function
/*    public void saveUser(User user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setReminders(new ArrayList<Reminder>());
        Role userRole = roleDao.findByRole("USER");
        user.setRoles(new ArrayList<Role>(Arrays.asList(userRole)));
        userDao.save(user);
    }*/
}
