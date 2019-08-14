package service;


import java.util.List;

import entity.SvcssCompany;
import entity.SvcssInvitationCode;

public interface ICompanyAuthentication {
	
	SvcssCompany showCompany(String companyid);
	
	boolean updatePassword(String userid,String password);
	
	List<SvcssInvitationCode> selectAllCode();
	
	

}
