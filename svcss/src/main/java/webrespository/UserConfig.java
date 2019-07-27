package webrespository;

import java.util.regex.Pattern;

import entity.UserKey;

public class UserConfig {
	
	//�û�����4��16λ����ĸ�����»��ߣ����ţ���
	public static final String USERNAME_REG=" /^[-_a-zA-Z0-9]{4,16}$/\r\n";
	//���루����6λ����������һλ��д��ĸ��һλСд��ĸ��һ�����֣�һ�������ַ�����
	public static final String PASSWORD_REG="/(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$@!%*#?&])[A-Za-z\\d$@!%*#?&]{6,}$/\r\n" ;
	
	
	
	public static final String ROOT_FILE_PATH ="SCVSS/file";
	public static final String ADMIN_IMAGE_PATH="SCVSS/file/admin";
	
	public boolean checkConfig(UserKey userKey) {
		boolean isMatch_Username = Pattern.matches(USERNAME_REG, userKey.getUsername());
		
		boolean isMatch_Password = Pattern.matches(USERNAME_REG, userKey.getPassword());
		
		if(isMatch_Username==true&&isMatch_Password==true) {
			return true;
		}else {

		    return false;
		}
		
	}

}
