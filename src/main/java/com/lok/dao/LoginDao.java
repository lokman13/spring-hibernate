package com.lok.dao;

import com.lok.entity.LoginBean;
import com.lok.util.DBConnection;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
    public String authenticateUser(LoginBean loginBean) {

        String userName = loginBean.getUserName(); //Keeping user entered values in temporary variables.
        String password = loginBean.getPassword();

        Connection con = null;
        java.sql.Statement statement = null;
        ResultSet resultSet = null;

        String userNameDB = "";
        String passwordDB = "";

        try {
            con = DBConnection.createConnection(); //establishing connection
            statement = (Statement) con.createStatement(); //Statement is used to write queries. Read more about it.
            resultSet = statement.executeQuery("select userName,password from users"); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.

            while (resultSet.next()) // Until next row is present otherwise it return false
            {
                userNameDB = resultSet.getString("userName"); //fetch the values present in database
                passwordDB = resultSet.getString("password");

                if (userName.equals(userNameDB) && password.equals(passwordDB)) {
                    return "SUCCESS"; ////If the user entered values are already present in database, which means user has already registered so I will return SUCCESS message.
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Invalid user credentials"; // Just returning appropriate message otherwise
    }
}
