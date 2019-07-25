package util;

import java.lang.reflect.Field;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import webrespository.MybatisUtil;
import webrespository.SpringBeans;

public class HttpAutoWiredServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	


	private void loadClass() {
		
		Class<?> curClass = this.getClass();
		
		System.out.println(curClass);
		
		Field[] fields = curClass.getDeclaredFields();
		
		for (Field field : fields) {
			
			
			AutoLoad autoLoad = field.getAnnotation(AutoLoad.class);
			
			if(autoLoad!=null) {
				
				 String serviceName = autoLoad.value();
				 
			
				 Object obj = SpringBeans.getBean(serviceName);
				 
				// Object obj = MybatisUtil.openSession().getMapper(field.getType());
	
				 try {
					field.setAccessible(true);
					
					
					field.set(this,obj);
					
					
					
					
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
		
	}


	

	/*
	* Title: init
	* Description: 
	* @throws ServletException 
	* @see javax.servlet.GenericServlet#init() 
	*/
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		loadClass();
		
	}
	
	
	
	

}
