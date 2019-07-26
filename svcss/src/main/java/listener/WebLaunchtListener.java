package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import webrespository.SpringBeans;


public class WebLaunchtListener implements ServletContextListener {

	
	public void contextInitialized(ServletContextEvent sce) {
		
		
		//启动spring+mybatis框架9
		SpringBeans.init();
	

		
	}

	
	public void contextDestroyed(ServletContextEvent sce) {
		
		System.out.println("关闭webapp......");
	
	}
	
	
	

}
