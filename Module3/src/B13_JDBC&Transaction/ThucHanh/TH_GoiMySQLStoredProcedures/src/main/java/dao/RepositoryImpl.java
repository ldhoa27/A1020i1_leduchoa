package dao;

import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RepositoryImpl implements Repository{
    private BaseRepository baseRepository = new BaseRepository();
    private static final String INSERT_USER_SQL = "insert into users(id, name, email, country) values (?, ?, ?, ?)";
    private static final String SELECT_USER_BY_ID_SQL = "select * from users where id = ?";
    private static final String SELECT_ALL_USER_SQL = "select * from users";
    private static final String DELETE_USER_BY_ID_SQL = "delete from users where id = ?";
    private static final String UPDATE_USER_SQL = "update users set name = ?, email = ?, country = ? where id = ?";
    @Override
    public void insertUser(User user) throws SQLException {
        Connection connection = baseRepository.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL);
        preparedStatement.setInt(1, user.getId());
        preparedStatement.setString(2, user.getName());
        preparedStatement.setString(3, user.getEmail());
        preparedStatement.setString(4, user.getCountry());

        preparedStatement.executeUpdate();

    }

    @Override
    public User selectUser(int id) throws SQLException {
        User user = null;
        Connection connection = baseRepository.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID_SQL);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String country = resultSet.getString("country");
            user = new User(id, name, email, country);
        }

        return user;
    }

    @Override
    public List<User> selectAllUser() throws SQLException {
        List<User> userList = new ArrayList<>();
        Connection connection = baseRepository.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USER_SQL);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String country = resultSet.getString("country");
            userList.add(new User(id, name, email, country));
        }
        return userList;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        Connection connection = baseRepository.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER_BY_ID_SQL);
        preparedStatement.setInt(1, id);

        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        Connection connection = baseRepository.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER_SQL);

        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getEmail());
        preparedStatement.setString(3, user.getCountry());
        preparedStatement.setInt(4, user.getId());

        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public User getUserById(int id) throws SQLException {
        User user = null;
        Connection connection = baseRepository.getConnection();

        CallableStatement callableStatement = connection.prepareCall("call get_user_by_id");
        callableStatement.setInt(1, id);

        ResultSet resultSet = callableStatement.executeQuery();

        if (resultSet.next()) {
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String country = resultSet.getString("country");
            user = new User(id, name, email, country);
        }

        return user;
    }

    @Override
    public void insertUserStore(User user) throws SQLException {
        Connection connection = baseRepository.getConnection();

        CallableStatement callableStatement = connection.prepareCall("call insert_user(?, ?, ?)");
        callableStatement.setInt(1, user.getId());
        callableStatement.setString(2, user.getName());
        callableStatement.setString(3, user.getEmail());
        callableStatement.setString(4, user.getCountry());

        callableStatement.executeUpdate();
    }
}
