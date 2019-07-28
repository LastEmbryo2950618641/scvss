package serviceimple;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.UserKey;
import mapper.UserKeyMapper;
import service.IUserAuthentication;
import webrespository.UserConfig;
import webrespository.UserCredentials;


@Service("userIdentityIfoHandle")
public class IMUserIdentityIfoHandle implements IUserAuthentication {
	
	
	@Autowired
	UserKeyMapper userKeyMapper;
	
	public boolean Authentication(UserKey userKey) {
		
		UserKey an=new UserKey();
		an=userKeyMapper.check(userKey.getUsername());
		if(an==null) {
			return false;
		}else {
			if((userKey.getPassword().equals(an.getPassword()))==true) {
				UserCredentials.setUid(an.getUid());
				UserCredentials.setUsername(an.getUsername());
				UserCredentials.setUtag(an.getUtag());
				return true;
			}else {
				return false;
			}
			
		}
		
	}

	public boolean addUserKey(UserKey userKey) {
		UserKey an=new UserKey();
		an=userKeyMapper.check(userKey.getUsername());
		if(an==null) {
			userKeyMapper.insert(userKey);
			return true;
		}else {
			return false;
		}
		
	}

	public boolean checkFormat(UserKey userKey) {
	
		
		
		return false;
	}

	public boolean userKeyIsExist(UserKey userKey) {
		UserConfig an=new UserConfig();
		boolean check=an.checkConfig(userKey);
		if(check==true) {
			return true;
		}else {
		    return false;
	    }
	}

}
