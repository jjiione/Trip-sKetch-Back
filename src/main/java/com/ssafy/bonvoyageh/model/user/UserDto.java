package com.ssafy.bonvoyageh.model.user;

import lombok.Data;

@Data
public class UserDto {
	private String userId;
	private String userPwd;
	private String email;
	private String name;
	private String birth;
	private String phone;
	private String question;
	private String answer;
	private String authorization;


}
