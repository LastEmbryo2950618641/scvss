package util;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

import entity.SvcssCompany;
import webrespository.BaseMessage;

public class ReturnFormat {
	
	
	public String Formation(BaseMessage an) {
		
		
		SvcssCompany bn=new SvcssCompany();
		String ReturnAndString="{"
	   		+ "Message:"+an.getMessage()
	   		+"code:"+an.getCode()
	   		+"isSuccess"+an.isSuccess()
	   		+"props:";
		if(an.props==null) {
			ReturnAndString=ReturnAndString+"null}";
			return ReturnAndString;
		}else if(an.props instanceof List) {
            an.props.toString();
            String json = JSON.toJSONString(an.props);
            ReturnAndString=ReturnAndString+json+"}";
			return ReturnAndString;
		}else {
			net.sf.json.JSONObject json=net.sf.json.JSONObject.fromObject(an.props);//将java对象转换为json对象  
			String str = json.toString();//将json对象转换为字符串  
			ReturnAndString=ReturnAndString+str+"}";
			return ReturnAndString;
		}
	   


		
		
	}	

}
