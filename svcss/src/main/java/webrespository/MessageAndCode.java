package webrespository;

public enum MessageAndCode {
	

	LOGIN_SUCCESS("登录成功","0001"),LOGIN_FAIL_USERINFO_MISTAKE("登录失败，用户信息填写失败","0002");
	
	private String message;
	private String code;
	
	private MessageAndCode(String message,String code)
	{
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	
	
	
	
	
}
