package com.ssafy.bonvoyageh.service.user;

import java.util.Map;

import com.ssafy.bonvoyageh.model.user.UserDto;

public interface UserService {

	int idCheck(String userId) throws Exception;
	void join(UserDto userDto) throws Exception;
//	UserDto login(Map<String, String> map) throws Exception;
	UserDto login(UserDto userDto) throws Exception;
	void updatePw(Map<String, String> map) throws Exception;
	/* Admin */
//	List<UserDto> listMember(Map<String, Object> map) throws Exception;
//	UserDto getUser(String userId) throws Exception;
	UserDto userInfo(String userid) throws Exception;
	void updateUser(UserDto userDto) throws Exception;
	void deleteUser(String userid) throws Exception;

	void saveRefreshToken(String userid, String refreshToken) throws Exception;
	Object getRefreshToken(String userid) throws Exception;
	void deleRefreshToken(String userid) throws Exception;
}
