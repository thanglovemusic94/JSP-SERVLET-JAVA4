package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Account;

public class UserDAO implements UserDAOImpl{

	public static Connection createConnection() {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=java4_lab5_3";
		String user = "sa";
		String password = "1234";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean Insert(Account acc) {
		PreparedStatement pstm = null;
		Connection conn = null;
		String sql = "INSERT into USERS(name, pass) values(?,?)";
		try {
			conn = createConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, acc.getUser());
			pstm.setString(2, acc.getPass());
			int rs = pstm.executeUpdate();
			if (rs>0) return true;
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	public List<Account> findAll() {
		String sql = "select * from USERS";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Connection conn = null;
        conn = createConnection();
		List<Account> list = new ArrayList<Account>();
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				Account acc = new Account();
				acc.setId(rs.getInt("id"));
				acc.setUser(rs.getString("name"));
				acc.setPass(rs.getString("pass"));
				acc.setAdmin(rs.getBoolean("isAdmin"));
				list.add(acc);
			}
			pstm.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}


    public Account findOne(int id) {
        String sql = "select * from USERS where id =?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Connection conn = null;
        conn = createConnection();
        List<Account> list = new ArrayList<Account>();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Account acc = new Account();
                acc.setUser(rs.getString("name"));
                acc.setPass(rs.getString("pass"));
                acc.setAdmin(rs.getBoolean("isAdmin"));
                list.add(acc);
            }
            pstm.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list.isEmpty() ? null:list.get(0);
    }

    public void update(Account acc){
		String sql = "update USERS set name =?, pass = ?, lastname =?, isAdmin = ? where id =?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Connection conn = null;
		conn = createConnection();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, acc.getUser());
            pstm.setString(1, acc.getPass());
            pstm.setBoolean(1, acc.isAdmin());
            pstm.setInt(1, acc.getId());
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	public void delete(int id){
		String sql = "detele from USERS where id =?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Connection conn = null;
        conn = createConnection();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
