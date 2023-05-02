package com.ssafy.bonvoyageh.model.user;

import com.ssafy.bonvoyageh.repository.user.UserDto;

import java.sql.SQLException;

public interface UserDao {

	UserDto login(String user_id, String user_pwd) throws SQLException;
	int join(UserDto userDto) throws SQLException;
	int updatePw(String pw, String id) throws SQLException;
	UserDto findID(String user_id) throws SQLException;
	void modify(UserDto userDto) throws SQLException;
	void delete(UserDto userDto) throws SQLException;
	UserDto getUserInfo(String userId) throws SQLException;
}
