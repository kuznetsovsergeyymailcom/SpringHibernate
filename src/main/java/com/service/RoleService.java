package com.service;

import com.model.Role;

public interface RoleService {
    Role getRoleByTitle(String title);
    void saveRole(Role role);
    Role getRoleById(Long id);
}
