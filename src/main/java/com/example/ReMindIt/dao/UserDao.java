package com.example.ReMindIt.dao;

import com.example.ReMindIt.model.User;

public interface UserDao {
    User findUserByUsername(String username);
}
