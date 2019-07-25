package webrespository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringBeans {
	
	
	private static final ApplicationContext factory = new ClassPathXmlApplicationContext("spring-beans.xml");
	
	public static void init()
	{
		System.out.println("Spring Beans初始化.....");
	}
	
	public static Object getBean(String className) {
		
		
		factory.getBean(className);
		
	
		return factory.getBean(className);
		
	}

}
