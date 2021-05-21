package model.service;


import model.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    List<User> findAll();

    void save(User user);

    User findById(int id);

    void update(User user);

    void remove(int id);

}