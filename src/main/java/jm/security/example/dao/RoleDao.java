package jm.security.example.dao;

import jm.security.example.model.Role;

import java.util.List;

public interface RoleDao {
    void saveRole(Role role);

    List<Role> getAllRoles();

    Role findRoleByRoleName(String RoleName);
}
