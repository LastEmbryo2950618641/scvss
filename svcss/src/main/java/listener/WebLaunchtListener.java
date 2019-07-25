package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import webrespository.MybatisUtil;
import webrespository.SpringBeans;


public class WebLaunchtListener implements ServletContextListener {

	
	public void contextInitialized(ServletContextEvent sce) {
		
		SpringBeans.init();
	

		
	}

	
	public void contextDestroyed(ServletContextEvent sce) {
		
		System.out.println("关闭webapp");
	
	}
	
	
	

}
