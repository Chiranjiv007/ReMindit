package com.example.ReMindIt.dao;
import com.example.ReMindIt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, String> {

    User findUserByUsername(String username);
}
