package com.ssafy.bonvoyageh.repository.user;

import com.ssafy.bonvoyageh.model.user.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.Map;

@Mapper
public interface UserDao {


	int idCheck(String userId) throws SQLException;
	UserDto login(Map<String, String> map) throws SQLException;
	void join(UserDto userDto) throws SQLException;
	void updatePw(String pw, String id) throws SQLException;
	UserDto findID(String user_id) throws SQLException;
	void modify(UserDto userDto) throws SQLException;
	void deleteUser(String userId) throws SQLException;
	UserDto getUserInfo(String userId) throws SQLException;

	void updateUserInfo(UserDto userDto);
}
