package webrespository;

public  class   BaseMessage<PropsType> {
	
	
	//消息
    private String message;
    
    
    //消息代码
    private String code;
    
    //是否成功
	private boolean isSuccess;
	//返回参数
	public PropsType props;    
	

	
	
	public String getMessage() {
		return message;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public PropsType getProps() {
		return props;
	}
	public void setProps(PropsType props) {
		this.props = props;
	}
	
	public BaseMessage(MessageAndCode messageAndCode, boolean isSuccess, PropsType props) {
		super();
		
		
		this.message = messageAndCode.getMessage();
		this.code = messageAndCode.getCode();
		this.isSuccess = isSuccess;
		this.props = props;
	}
	
	
	

	
	
	
	
	
	
}
