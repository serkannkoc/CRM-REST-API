package com.example.crmrestapi.user;

import java.util.List;
public interface UserService {
    User saveUser(User user);
    List<User> fetchUserList();
    User updateUser(User user, Long id);
    void deleteUserById(Long id);
}
