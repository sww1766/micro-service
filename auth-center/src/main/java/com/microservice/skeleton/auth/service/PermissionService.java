package com.microservice.skeleton.auth.service;

import com.microservice.skeleton.auth.entity.RcMenuEntity;

import java.util.List;

public interface PermissionService {
    List<RcMenuEntity> getPermissionsByRoleId(Integer roleId);
}
