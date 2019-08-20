package service;

import entity.SvcssStudent;
import entity.SvcssUserKey;

public interface IUserAuthentication {
	
	
	
	/** 
	* @Title: Authentication 
	* @Description: 验证身份
	* @param @param username
	* @param @param password
	* @param @return
	* @return boolean
	* @throws 
	*/
	boolean Authentication(SvcssUserKey userKey);
	
	/** 
	* @Title: addUserKey 
	* @Description: 添加用户密匙
	* @param @param userKey
	* @param @return
	* @return boolean
	* @throws 
	*/
	boolean addUserKey(SvcssUserKey userKey);
	
	/** 
	* @Title: userKeyIsExist 
	* @Description: 用户密匙是否存在,如果存在，用UUID添加32位id
	* @param @return
	* @return boolean
	* @throws 
	*/
	boolean userKeyIsExist(SvcssUserKey userKey);
	
	/** 
	* @Title: checkFormat 
	* @Description: 检查格式
	* @param @param userKey
	* @param @return
	* @return boolean
	* @throws 
	*/
	boolean checkFormat(SvcssUserKey userKey);
	
	/**
	 * 
	
	* @Title: selectSvcssUserKey
	
	* @Description: 获取账号信息
	
	* @param userid
	* @return
	 */
	SvcssUserKey selectSvcssUserKey(String userid);
	
	
	/**
	 * @Description:查看选课的学生信息
	 */
	SvcssStudent selectStuInformation(String stu_id);
	
	

}
