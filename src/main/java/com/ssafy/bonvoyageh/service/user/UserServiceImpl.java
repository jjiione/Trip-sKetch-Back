package com.ssafy.bonvoyageh.service.user;

import com.ssafy.bonvoyageh.repository.user.UserDao;
import com.ssafy.bonvoyageh.model.user.UserDto;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class UserServiceImpl implements UserService {
	
//	@Autowired
//	private SqlSession sqlSession;
	
	private UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public int idCheck(String userId) throws Exception {
//		return sqlSession.getMapper(UserDao.class).idCheck(userId);
		return userDao.idCheck(userId);
	}

	@Override
	public void join(UserDto userDto) throws Exception {
//		sqlSession.getMapper(UserDao.class).joinMember(userDto);
		userDao.join(userDto);
	}

	@Override
	public UserDto login(Map<String, String> map) throws Exception {
//		return sqlSession.getMapper(UserDao.class).loginMember(map);
		return userDao.login(map);
	}


	@Override
	public UserDto getUser(String userId) throws Exception {
		return userDao.getUserInfo(userId);
	}

	@Override
	public void updateUserInfo(UserDto userDto) throws Exception {
		userDao.updateUserInfo(userDto);
	}

	@Override
	public void deleteUser(String userId) throws Exception {
		userDao.deleteUser(userId);
	}

}
