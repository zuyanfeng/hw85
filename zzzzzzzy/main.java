package zzzzzzzy;

import java.sql.*;

public class main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/train", "root", "root");
        String sql = "select * from hero";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);


        while (rs.next()) {
            int id = rs.getInt(1);
            String sno = rs.getString(2);
            String sname = rs.getString("sname");
            String ssex = rs.getString("ssex");
            int sage = rs.getInt(5);
            System.out.println(id + sno + sname + ssex + sage);
        }

        rs.close();
        statement.close();
        connection.close();
    }

}

