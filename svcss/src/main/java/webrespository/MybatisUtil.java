package webrespository;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	
	
	private static SqlSessionFactory sqlSessionFactory;
	
	public static void init() {
		
		String resource = "mybatis-config.xml";
		
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		
		System.out.println("mybatis配置初始化.....");
	}

	
	public static SqlSession openSession() {
		return sqlSessionFactory.openSession();
	}

}
