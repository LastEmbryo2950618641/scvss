package service;

import java.util.List;

import entity.SvcssCourse;
import entity.SvcssTimeChoose;

public interface IMCourseAuthentication {
	
	/**
	 * 
	
	* @Title: selectCourseInfor
	
	* @Description: �����Ŀγ������Ϣ
	
	* @return
	 */
	SvcssCourse selectCourseInfor(String courseid);
	
	/**
	 * 
	
	* @Title: selectTimetoChoose
	
	* @Description: 
	
	* @return
	 */
	SvcssTimeChoose selectTimetoChoose();
	
	/**
	 * 
	
	* @Title: selectAllCourseInfor
	
	* @Description: 
	
	* @return
	 */
	List<SvcssCourse> selectAllCourseInfor();
	

}
