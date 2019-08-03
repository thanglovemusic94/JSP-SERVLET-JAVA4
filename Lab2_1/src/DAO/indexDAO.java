package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BEAN.ThueBao;

public class indexDAO {
	public static List<ThueBao> list;

	public static Boolean Show(Connection conn, ThueBao thueBaocheck) {
		list = new ArrayList<ThueBao>();
		try {
			if (thueBaocheck.getName() != "" ) {
				// where name like n'%" + thueBaocheck.getName() + "%'
				String sql = "select * from lab2_1 where name like '%" + thueBaocheck.getName() + "%' ";
				PreparedStatement preparedStatement = null;
				preparedStatement = conn.prepareStatement(sql);
				ResultSet rs = preparedStatement.executeQuery();
				if (rs != null) {
					while (rs.next()) {
						ThueBao thueBao = new ThueBao();
						thueBao.setName(rs.getString("name"));
						thueBao.setPhone(rs.getString("phone"));
						thueBao.setAddress(rs.getString("address"));
						list.add(thueBao);
					}
					return true;
				}
				preparedStatement.close();
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
