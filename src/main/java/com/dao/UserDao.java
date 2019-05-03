package com.dao;

import com.model.User;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
    User getUserById(Long id);
    User getUserByLoogin(String login);
    void removeUserById(Long id);
    void updateUser(User user);
}
