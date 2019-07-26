package serviceimple;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.UserKey;
import mapper.UserKeyMapper;
import service.IUserAuthentication;


@Service("userIdentityIfoHandle")
public class IMUserIdentityIfoHandle implements IUserAuthentication {
	
	
	@Autowired
	UserKeyMapper userKeyMapper;
	
	public boolean Authentication(String username, String password) {
		
		List<UserKey> list = userKeyMapper.selectAll();
		for (UserKey userKey : list) {
			System.out.println(userKey.getUid());
		}
		return true;
	}

	public boolean addUserKey(UserKey userKey) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean checkFormat(UserKey userKey) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean userKeyIsExist(UserKey userKey) {
		// TODO Auto-generated method stub
		return false;
	}

}
