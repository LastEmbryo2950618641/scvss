package serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import entity.SvcssCourse;
import entity.SvcssCourseExample;
import entity.SvcssTimeChoose;
import entity.SvcssTimeChooseExample;
import mapper.SvcssCourseMapper;
import mapper.SvcssTimeChooseMapper;
import service.IMCourseAuthentication;

public class IMCourseIfoHandle implements IMCourseAuthentication {

	
	@Autowired
	SvcssCourseMapper svcssCourseMapper;
	
	@Autowired
	SvcssTimeChooseMapper svcssTimeChooseMapper;
	
	public SvcssCourse selectCourseInfor(String courseid) {
		
		SvcssCourseExample example=new SvcssCourseExample();
		example.createCriteria().andCourseIdEqualTo(courseid);
		SvcssCourse bn=svcssCourseMapper.selectByExample(example).get(0);
		// TODO Auto-generated method stub
		return bn;
	}

	public SvcssTimeChoose selectTimetoChoose() {
		// TODO Auto-generated method stub
		SvcssTimeChooseExample example=new SvcssTimeChooseExample();
		example.createCriteria().andCourseStartChooseIsNotNull();
		SvcssTimeChoose bn=(SvcssTimeChoose) svcssTimeChooseMapper.selectByExample(example).get(0);
		return bn;
	}

	public List<SvcssCourse> selectAllCourseInfor() {
		// TODO Auto-generated method stub
		SvcssCourseExample example=new SvcssCourseExample();
		example.createCriteria().andCourseIdIsNotNull();
		List<SvcssCourse> bn=svcssCourseMapper.selectByExample(example);
		
		
		return bn;
	}

	
}
