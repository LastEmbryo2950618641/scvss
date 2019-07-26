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
	 * ����
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
	 * ��¼
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
			on.put("massage", "��¼�ɹ�");
			
			mapper.writeValue(pw, on);
			
			pw.flush();
			pw.close();
		}
		
		
	}

	/**
	 * ע��
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
			on.put("massage", "ע��ʧ����Ϣ��ʽ����");
			
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
			on.put("massage", "�û��Ѵ���");
			
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
		on.put("massage", "�û���ӳɹ�");
		
		mapper.writeValue(pw, on);
		
		pw.flush();
		pw.close();
		
		return;
		
	}
	
	
	
	
	
	

}
