package com.microservice.skeleton.auth.service;

import com.microservice.skeleton.auth.entity.RcUserEntity;

public interface UserService {
    RcUserEntity findByUsername(String username);
}
