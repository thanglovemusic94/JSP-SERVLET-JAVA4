package dao;

import bean.LoginBean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class LoginDao {
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/java4_login?useSSL=false";
        String usename = "root";
        String pass = "1234";
        Connection conn = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, usename, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  conn;
    }
    public boolean validate(LoginBean loginBean){
        boolean status = false;
        String sql = "select * from login where username = ? and password = ? ";

        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            pr = conn.prepareStatement(sql);
            pr.setString(1, loginBean.getUsername());
            pr.setString(2, loginBean.getPassword());
            System.out.println(pr);
            rs = pr.executeQuery();
            status = rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    public List<LoginBean> infor(){
        List<LoginBean> list = new ArrayList<LoginBean>();
        String sql = "select * from login";

        Connection conn = null;
        PreparedStatement pr = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            pr = conn.prepareStatement(sql);
            rs = pr.executeQuery();

            while (rs.next()){
                LoginBean loginBean = new LoginBean();
                loginBean.setUsername(rs.getString("username"));
                loginBean.setPassword(rs.getString("password"));
                list.add(loginBean);
            }
            return list;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
