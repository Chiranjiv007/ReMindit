package com.example.ReMindIt.service;

import com.example.ReMindIt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.ArrayList;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userService.findUserByUserName(s);
        List<GrantedAuthority> authorities = getUserAuthority(user);
        return buildUserForAuthentication(user,authorities);
    }

    public List<GrantedAuthority> getUserAuthority(User user){

        List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();

        for(int i=0;i<3;i++){
            roles.add(new SimpleGrantedAuthority("USER"));
        }

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>(roles);

        return grantedAuthorities;
    }


    public UserDetails buildUserForAuthentication(User user, List<GrantedAuthority> authorities)
    {
        return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),
                true,true,true,true, authorities);
    }
}
