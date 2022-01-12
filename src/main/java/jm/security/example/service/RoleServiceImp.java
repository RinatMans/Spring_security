package jm.security.example.service;

import jm.security.example.dao.RoleDao;
import jm.security.example.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImp implements RoleService{

    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImp(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Transactional
    @Override
    public void saveRole(Role role) {
        this.roleDao.saveRole(role);
    }

    @Transactional
    @Override
    public List<Role> getAllRoles() {
        return this.roleDao.getAllRoles();
    }

    @Transactional
    @Override
    public Role findRoleByRoleName(String RoleName) {
        return this.roleDao.findRoleByRoleName(RoleName);
    }
}
