package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc {

    public static void main(String[] args) throws SQLException {
        String sql1 = "select * from employee";

        String sql = " insert into employee (empcode, empname,empage,esalary)"
                + " values (?,?,?,?)";

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/guvi?user=root&password=root");

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for (int i = 1; i <= 4; i++) {

            switch (i) {
                case 1:
                    preparedStatement.setInt(1, 101);
                    preparedStatement.setString(2, "Jenny");
                    preparedStatement.setInt(3, 25);
                    preparedStatement.setInt(4, 10000);
                    int rowsAffected = preparedStatement.executeUpdate();
                    break;
                case 2:
                    preparedStatement.setInt(1, 102);
                    preparedStatement.setString(2, "Jacky");
                    preparedStatement.setInt(3, 30);
                    preparedStatement.setInt(4, 20000);
                    int rowsAffected1 = preparedStatement.executeUpdate();
                    break;
                case 3:
                    preparedStatement.setInt(1, 103);
                    preparedStatement.setString(2, "Joy");
                    preparedStatement.setInt(3, 20);

                    preparedStatement.setInt(4, 40000);
                    int rowsAffected2 = preparedStatement.executeUpdate();
                    break;
                case 4:
                    preparedStatement.setInt(1, 104);
                    preparedStatement.setString(2, "John");
                    preparedStatement.setInt(3, 40);

                    preparedStatement.setInt(4, 80000);
                    int rowsAffected3 = preparedStatement.executeUpdate();
                case 5:

                    preparedStatement.setInt(1, 105);
                    preparedStatement.setString(2, "Shameer");

                    preparedStatement.setInt(3, 25);

                    preparedStatement.setInt(4, 90000);
                    int rowsAffected4 = preparedStatement.executeUpdate();

            }
        }

        connection.close();
        preparedStatement.close();


    }
}

