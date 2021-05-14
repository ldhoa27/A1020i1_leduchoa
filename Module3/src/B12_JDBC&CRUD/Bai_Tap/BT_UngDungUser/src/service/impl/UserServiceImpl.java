package service.impl;

import dao.IUserDAO;
import dao.UserDAOImpl;
import model.User;
import service.UserService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    private IUserDAO userDAO = new UserDAOImpl();

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        try {
            userList = userDAO.selectAllUser();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public void save(User user) {
        try {
            userDAO.insertUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User findById(int id) {
        try {
            return userDAO.selectUser(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(User user) {
        try {
            userDAO.updateUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void remove(int id) {
        try {
            userDAO.deleteUser(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> findByCountry(String country) {
        List<User> list = new ArrayList<>();
        try {
            list = userDAO.selectByCountry(country);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<User> sortNameASC() {
        return this.userDAO.sortNameASC();

    }


}
