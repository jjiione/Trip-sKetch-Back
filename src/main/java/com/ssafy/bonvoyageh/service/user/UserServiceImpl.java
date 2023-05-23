package com.ssafy.bonvoyageh.service.user;

import java.util.HashMap;
import java.util.Map;

import com.ssafy.bonvoyageh.model.user.UserDto;
import com.ssafy.bonvoyageh.repository.user.UserDao;
import org.springframework.stereotype.Service;


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
//		return sqlSession.getMapper(MemberMapper.class).idCheck(userId);
		return userDao.idCheck(userId);
	}

	@Override
	public void join(UserDto userDto) throws Exception {
//		sqlSession.getMapper(MemberMapper.class).joinMember(memberDto);
		userDao.join(userDto);
	}

//	@Override
//	public UserDto login(Map<String, String> map) throws Exception {
////		return sqlSession.getMapper(MemberMapper.class).loginMember(map);
//		return userDao.login(map);
//	}
@Override
	public UserDto login(UserDto userDto) throws Exception {
	if(userDto.getUserId() == null || userDto.getUserPwd() == null)
		return null;
	return userDao.login(userDto);
//	return sqlSession.getMapper(MemberMapper.class).login(memberDto);
}

	@Override
	public void updatePw(Map<String, String> map) throws Exception {
		userDao.updatePw(map);
	}

//	/* ADMIN */
//	@Override
//	public List<UserDto> listMember(Map<String, Object> map) throws Exception {
//		return userDao.listMember(map);
//	}

//	@Override
//	public UserDto getUser(String userId) throws Exception {
//		return userDao.getUserInfo(userId);
//	}

	@Override
	public UserDto userInfo(String userid) throws Exception {
		return userDao.userInfo(userid);
//		return sqlSession.getMapper(MemberMapper.class).userInfo(userid);
	}

	@Override
	public void updateUser(UserDto userDto) throws Exception {
		userDao.modify(userDto);
	}

	@Override
	public void deleteUser(String userId) throws Exception {
		userDao.delete(userId);
	}

	@Override
	public void saveRefreshToken(String userid, String refreshToken) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("userid", userid);
		map.put("token", refreshToken);
		userDao.saveRefreshToken(map);
	}

	@Override
	public Object getRefreshToken(String userid) throws Exception {
		return userDao.getRefreshToken(userid);
	}

	@Override
	public void deleRefreshToken(String userid) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("userid", userid);
		map.put("token", null);
		userDao.deleteRefreshToken(map);
	}

}
