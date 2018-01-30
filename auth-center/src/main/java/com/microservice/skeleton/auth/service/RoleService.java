package com.microservice.skeleton.auth.service;

import com.microservice.skeleton.auth.entity.RcRoleEntity;

import java.util.List;

public interface RoleService {
    List<RcRoleEntity> getRoleValuesByUserId(Integer userId);
}
