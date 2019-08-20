package util;

import java.util.List;

import entity.SvcssCompany;
import webrespository.BaseMessage;

public class ReturnFormat {
	
	
	public String Formation(BaseMessage an) {
		Object object;
		SvcssCompany bn=new SvcssCompany();
		String ReturnAndString="{"
	   		+ "Message:"+an.getMessage()
	   		+"code:"+an.getCode()
	   		+"isSuccess"+an.isSuccess()
	   		+"props:";
		if(an.props==null) {
			ReturnAndString=ReturnAndString+"null}";
		}else if(an.props instanceof List) {
			Class<? extends Object> mn=an.props.getClass();
			
			
		}else {
			
		}
	   

		
		return null;
		
		
	}	

}
