package com.dao;

import com.model.Role;

public interface RoleDao {
    Role getRoleByTitle(String title);
    void saveRole(Role role);
}
