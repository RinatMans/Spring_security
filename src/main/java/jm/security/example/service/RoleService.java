package jm.security.example.service;

import jm.security.example.model.Role;

import java.util.List;

public interface RoleService {
    void  saveRole(Role role);
    List<Role> getAllRoles();
    Role findRoleByRoleName(String RoleName);
}