package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.User;

public class LoginDao {
	public static boolean checkLogin(Connection connection, User user) {
		String sql = "select * from Registration where useName = ? and passWord = ?";
		PreparedStatement pstm = null;
		try {
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, user.getUseame());
			pstm.setString(2, user.getPassword());
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
					return true;
			}
			pstm.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
