package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import entity.SvcssInvitationCode;
import entity.SvcssUserKey;
import service.ICompanyAuthentication;
import service.IUserAuthentication;
import util.AutoLoad;
import util.HttpAutoWiredServlet;
import webrespository.BaseMessage;

@WebServlet("/UserIdentity")
public class UserIdentityServlet extends HttpAutoWiredServlet {

	
	
	@AutoLoad("userIdentityIfoHandle")
	IUserAuthentication userIdentityIfoHandle;
	
	@AutoLoad("ICompanyIfoHandle")
	ICompanyAuthentication ICompanyIfoHandle;

	
	private static final long serialVersionUID = 1L;

	
	/**
	 * ����
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		String username = "root";
		String password = "123456";
		SvcssUserKey userKey = new SvcssUserKey();
		
		userKey.setUserUsername(username);
		userKey.setUserPassword(password);
		
		
		
		if(userIdentityIfoHandle.Authentication(userKey))
		{
			System.out.println("test");
		}
		
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
		*/
	    
		List<SvcssInvitationCode> list=ICompanyIfoHandle.selectAllCode();
		PrintWriter pw = resp.getWriter();
		ObjectMapper mapper = new ObjectMapper();
		
		ObjectNode on = mapper.createObjectNode();
		for(int i=0;i<list.size();i++) {
			on.put("��Ч����"+i, list.get(i).getCode());
		}
		
		mapper.writeValue(pw, on);
		
		pw.flush();
		pw.close();
		
		
	}

	/**
	 * ��¼
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		SvcssUserKey userKey = new SvcssUserKey();
		
		userKey.setUserUsername(username);
		userKey.setUserPassword(password);
		if(userIdentityIfoHandle.Authentication(userKey))
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
		
		SvcssUserKey userKey = new SvcssUserKey();
		
		userKey.setUserUsername(username);
		userKey.setUserPassword(password);
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
