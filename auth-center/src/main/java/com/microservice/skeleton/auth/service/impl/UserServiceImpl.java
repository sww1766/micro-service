package com.microservice.skeleton.auth.service.impl;

import com.microservice.skeleton.auth.entity.RcUserEntity;
import com.microservice.skeleton.auth.repository.UserRepository;
import com.microservice.skeleton.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public RcUserEntity findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
