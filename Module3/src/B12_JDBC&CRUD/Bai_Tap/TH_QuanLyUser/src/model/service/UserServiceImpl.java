package model.service;

import model.bean.User;
import model.repository.IUserDAO;
import model.repository.UserDAOImpl;

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




}


