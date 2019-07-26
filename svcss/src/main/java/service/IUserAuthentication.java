package service;

import entity.UserKey;

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
	boolean Authentication(UserKey userKey);
	
	/** 
	* @Title: addUserKey 
	* @Description: 添加用户密匙
	* @param @param userKey
	* @param @return
	* @return boolean
	* @throws 
	*/
	boolean addUserKey(UserKey userKey);
	
	/** 
	* @Title: userKeyIsExist 
	* @Description: 用户密匙是否存在,如果存在，用UUID添加32位id
	* @param @return
	* @return boolean
	* @throws 
	*/
	boolean userKeyIsExist(UserKey userKey);
	
	/** 
	* @Title: checkFormat 
	* @Description: 检查格式
	* @param @param userKey
	* @param @return
	* @return boolean
	* @throws 
	*/
	boolean checkFormat(UserKey userKey);

}
