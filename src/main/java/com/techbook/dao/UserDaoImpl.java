package com.techbook.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.techbook.domain.User;
import com.techbook.util.DbConnectionUtil;

public class UserDaoImpl implements UserDao {
	public static final String INSERT_SQL = "INSERT INTO customer_tbl (customerid, accountid, cutomer_firstName, customer_middleName, customer_lastName, customer_address, phone, user_loginid) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	public static final String UPDATE_SQL = "update cutomer_tbl set customerid, accountid, cutomer_firstName, customer_middleName, customer_lastName, customer_address, phone, user_loginid phone=? where loginid = ?";

	public int saveUserInfo(User user) {
		int saved = 0;

		try (PreparedStatement ps = DbConnectionUtil.getConnection().prepareStatement(INSERT_SQL);) {

			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());
			ps.setLong(3, user.getMobileNo());
			ps.setString(4, user.getEmail());
			ps.setDate(5, new Date(user.getDob().getTime()));
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return saved;
	}

	public int updateUserInfo(User user) {
		return 0;
	}

}



