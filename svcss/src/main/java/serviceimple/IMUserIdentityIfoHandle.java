package serviceimple;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.UserKey;
import mapper.UserKeyMapper;
import service.IUserAuthentication;


@Service("userIdentityIfoHandle")
public class IMUserIdentityIfoHandle implements IUserAuthentication {
	
	
	@Autowired
	UserKeyMapper userKeyMapper;
	
	public boolean Authentication(UserKey userKey) {
		
	
		return true;
	}

	public boolean addUserKey(UserKey userKey) {
		return false;
	}

	public boolean checkFormat(UserKey userKey) {
	
		
		
		return false;
	}

	public boolean userKeyIsExist(UserKey userKey) {
		return false;
	}

}
