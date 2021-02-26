package com.tafiqjack.spring_securityjwt.security.service;

import com.tafiqjack.spring_securityjwt.models.User;
import com.tafiqjack.spring_securityjwt.reposoitory.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    UserRepo userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("User not found with -> username or email : " + username));
        return UserPrinciple.build(user);
    }

}
