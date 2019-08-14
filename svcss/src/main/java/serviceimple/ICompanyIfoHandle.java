package serviceimple;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.SvcssCompany;
import entity.SvcssCompanyExample;
import entity.SvcssInvitationCode;
import entity.SvcssInvitationCodeExample;
import entity.SvcssUserKey;
import entity.SvcssUserKeyExample;
import mapper.SvcssCompanyMapper;
import mapper.SvcssInvitationCodeMapper;
import mapper.SvcssUserKeyMapper;
import service.ICompanyAuthentication;

@Service("ICompanyIfoHandle")
public class ICompanyIfoHandle implements ICompanyAuthentication{

	@Autowired
	SvcssUserKeyMapper svcssUserKeyMapper;
	
	@Autowired
	SvcssCompanyMapper svcssCompanyMapper;
	
	@Autowired
	SvcssInvitationCodeMapper svcssInvitationCodeMapper;
	
	
	public SvcssCompany showCompany(String companyid) {
		// TODO Auto-generated method stub
		SvcssCompanyExample an=new SvcssCompanyExample();
		an.createCriteria().andCompanyIdEqualTo(companyid);
		SvcssCompany getvalue=(SvcssCompany) svcssCompanyMapper.selectByExample(an);
		
		return getvalue;
	}

	public boolean updatePassword(String userid,String password) {
		// TODO Auto-generated method stub
		SvcssUserKeyExample example=new SvcssUserKeyExample();
		example.createCriteria().andUserIdEqualTo(userid);
		SvcssUserKey userkey=new SvcssUserKey();
		userkey.setUserPassword(password);
		svcssUserKeyMapper.updateByExample(userkey, example);
		return true;
	}

	public List<SvcssInvitationCode> selectAllCode() {
		// TODO Auto-generated method stub
		SvcssInvitationCodeExample example=new SvcssInvitationCodeExample();
		example.createCriteria().andCodeIsNotNull();
		List<SvcssInvitationCode> list=svcssInvitationCodeMapper.selectByExample(example);
		return list;
	}

}
