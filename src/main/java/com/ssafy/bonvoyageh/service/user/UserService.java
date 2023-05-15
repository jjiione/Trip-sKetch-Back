package com.ssafy.bonvoyageh.service.user;

import com.ssafy.bonvoyageh.model.user.UserDto;

import java.util.Map;


public interface UserService {

	int idCheck(String userId) throws Exception;
	void join(UserDto memberDto) throws Exception;
	UserDto login(Map<String, String> map) throws Exception;
	
	/* Admin */
//	List<UserDto> listMember(Map<String, Object> map) throws Exception;

	UserDto getUser(String userId) throws Exception;

	void updateUserInfo(UserDto memberDto) throws Exception;
	void deleteUser(String userid) throws Exception;
	
}
