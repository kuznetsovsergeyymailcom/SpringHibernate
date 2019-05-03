package com.service;

import com.dao.RoleDao;
import com.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role getRoleByTitle(String title) {
        return roleDao.getRoleByTitle(title);
    }

    @Override
    public void saveRole(Role role) {
        roleDao.saveRole(role);
    }
}
