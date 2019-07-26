package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import entity.UserKey;
import service.IUserAuthentication;
import util.AutoLoad;
import util.HttpAutoWiredServlet;
import webrespository.SpringBeans;

@WebServlet("/UserIdentity")
public class UserIdentityServlet extends HttpAutoWiredServlet {

	
	
	@AutoLoad("userIdentityIfoHandle")
	IUserAuthentication userIdentityIfoHandle;

	
	private static final long serialVersionUID = 1L;

	
	/**
	 * 测试
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = "root";
		String password = "123456";
		
		
		
		if(userIdentityIfoHandle.Authentication(username, password))
		{
			System.out.println("test");
		}
		
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}

	/**
	 * 登录
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		UserKey userKey = new UserKey();
		
		
		if(userIdentityIfoHandle.Authentication(username, password))
		{
			PrintWriter pw = resp.getWriter();
			ObjectMapper mapper = new ObjectMapper();
			
			ObjectNode on = mapper.createObjectNode();
			
			on.put("isSuccess", true);
			on.put("massage", "登录成功");
			
			mapper.writeValue(pw, on);
			
			pw.flush();
			pw.close();
		}
		
		
	}

	/**
	 * 注册
	 */
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		UserKey userKey = new UserKey();
		
		userKey.setUsername(username);
		userKey.setPassword(password);
		if(!userIdentityIfoHandle.checkFormat(userKey))
		{
			PrintWriter pw = resp.getWriter();
			ObjectMapper mapper = new ObjectMapper();
			
			ObjectNode on = mapper.createObjectNode();
			
			on.put("isSuccess", false);
			on.put("massage", "注册失败信息格式错误");
			
			mapper.writeValue(pw, on);
			
			pw.flush();
			pw.close();
			
			return;
		}
		if(!userIdentityIfoHandle.userKeyIsExist(userKey))
		{
			PrintWriter pw = resp.getWriter();
			ObjectMapper mapper = new ObjectMapper();
			
			ObjectNode on = mapper.createObjectNode();
			
			on.put("isSuccess", false);
			on.put("massage", "用户已存在");
			
			mapper.writeValue(pw, on);
			
			pw.flush();
			pw.close();
			
			return;
		}
		
	
		userIdentityIfoHandle.addUserKey(userKey);
		PrintWriter pw = resp.getWriter();
		ObjectMapper mapper = new ObjectMapper();
		
		ObjectNode on = mapper.createObjectNode();
		
		on.put("isSuccess", true);
		on.put("massage", "用户添加成功");
		
		mapper.writeValue(pw, on);
		
		pw.flush();
		pw.close();
		
		return;
		
	}
	
	
	
	
	
	

}
