package DAO.Impl;

import BEAN.ThueBao;
import DAO.IindexDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class indexDAO implements IindexDAO {
    public static Connection connection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("success");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/lab2_1", "root", "1234");
        } catch (ClassNotFoundException e) {
            return null;
        } catch (SQLException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(connection());
    }
    public List<ThueBao> findAll(String name) {
        String sql = "select * from LAB2_1 where name like '%" + name + "%' ";
        List<ThueBao> list = new ArrayList<ThueBao>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        connection = connection();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ThueBao thueBao = new ThueBao();
                thueBao.setName(rs.getString("tenthuebao"));
                thueBao.setPhone(rs.getString("sodienthoai"));
                thueBao.setAddress(rs.getString("diachi"));
                list.add(thueBao);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                return null;
            }
        }
        return null;
    }
}
