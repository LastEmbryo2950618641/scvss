package serviceimple;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entity.SvcssUserKey;
import entity.SvcssUserKeyExample;
import mapper.SvcssUserKeyMapper;
import service.IUserAuthentication;
import webrespository.UserConfig;
import webrespository.UserCredentials;


@Service("userIdentityIfoHandle")
public class IMUserIdentityIfoHandle implements IUserAuthentication {
	
	
	@Autowired
	SvcssUserKeyMapper svcssUserKeyMapper;
	
	public boolean Authentication(SvcssUserKey svcssUserKey) {
		
		
		SvcssUserKey an=new SvcssUserKey();
		SvcssUserKeyExample svcssUserKeyExample = new SvcssUserKeyExample();
		svcssUserKeyExample.createCriteria().andUserUsernameEqualTo(svcssUserKey.getUserUsername());
		an=svcssUserKeyMapper.selectByExample(svcssUserKeyExample).get(0);
		
		if(an==null) {
			return false;
		}else {
			if((svcssUserKey.getUserPassword().equals(an.getUserPassword()))==true) {
				UserCredentials.setUid(an.getUserId());
				UserCredentials.setUsername(an.getUserUsername());
				UserCredentials.setUtag(an.getUserTag());
				return true;
			}else {
				return false;
			}
			
		}
		
	}

	@SuppressWarnings("unused")
	public boolean addUserKey(SvcssUserKey svcssUserKey) {
		SvcssUserKey an=new SvcssUserKey();
		SvcssUserKeyExample svcssUserKeyExample = new SvcssUserKeyExample();
		svcssUserKeyExample.createCriteria().andUserUsernameEqualTo(svcssUserKey.getUserUsername());
		an=svcssUserKeyMapper.selectByExample(svcssUserKeyExample).get(0);
		if(an==null) {
			svcssUserKeyMapper.insert(svcssUserKey);
			return true;
		}else {
			return false;
		}
		
	}

	public boolean checkFormat(SvcssUserKey userKey) {
	
		
		
		return false;
	}

	public boolean userKeyIsExist(SvcssUserKey userKey) {
		UserConfig an=new UserConfig();
		boolean check=an.checkConfig(userKey);
		if(check==true) {
			return true;
		}else {
		    return false;
	    }
	}

	public SvcssUserKey selectSvcssUserKey(String userid) {
		// TODO Auto-generated method stub
		SvcssUserKey an=new SvcssUserKey();
		SvcssUserKeyExample svcssUserKeyExample = new SvcssUserKeyExample();
		svcssUserKeyExample.createCriteria().andUserIdEqualTo(userid);
		an=svcssUserKeyMapper.selectByExample(svcssUserKeyExample).get(0);
		return an;
	}

}
