package com.ssafy.bonvoyageh.repository.user;

import com.ssafy.bonvoyageh.model.user.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.Map;

@Mapper
public interface UserDao {

	UserDto login(Map<String, String> map) throws SQLException;
	int join(UserDto userDto) throws SQLException;
	int updatePw(Map<String, String> map) throws SQLException;
	UserDto findID(String userId) throws SQLException;
	void modify(UserDto userDto) throws SQLException;
	void delete(String userId) throws SQLException;
	UserDto getUserInfo(String userId) throws SQLException;

	int idCheck(String userId) throws SQLException;
}
