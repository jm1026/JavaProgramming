package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;
	
public interface UserInfoDao { 
	//유저에 대한 DB오퍼레이션 할 때 구현해야 할 기능을 선언해 두는 것이다.
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}
