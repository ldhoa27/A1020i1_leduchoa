package dao;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface Repository {
    void insertUser(User user) throws SQLException;
    User selectUser(int id) throws SQLException;
    List<User> selectAllUser() throws SQLException;
    boolean deleteUser(int id) throws SQLException;
    boolean updateUser(User user) throws SQLException;
    User getUserById(int id) throws SQLException;
    void insertUserStore(User user) throws SQLException;
}
