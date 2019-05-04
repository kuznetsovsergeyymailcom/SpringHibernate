package com.dao;

import com.model.Role;

public interface RoleDao {
    Role getRoleByTitle(String title);
    Role getRoleById(Long id);
    void saveRole(Role role);
}
