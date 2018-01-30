package com.microservice.skeleton.auth.service.impl;

import com.microservice.skeleton.auth.entity.RcRoleEntity;
import com.microservice.skeleton.auth.repository.RoleRepository;
import com.microservice.skeleton.auth.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public List<RcRoleEntity> getRoleValuesByUserId(Integer userId) {
        return roleRepository.getRoleValuesByUserId(userId);
    }
}
