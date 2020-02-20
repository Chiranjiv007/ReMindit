package com.example.ReMindIt.dao;

import com.example.ReMindIt.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Repository
public class UserDaoImpl {

//    @Autowired
    private SessionFactory sessionFactory;

//    @Override
    public User findUserByUsername(String username) {
        return (User) sessionFactory.getCurrentSession().get(User.class, username);
    }
}