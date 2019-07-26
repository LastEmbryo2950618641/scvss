package webrespository;

public class UserCredentials {
	
	
	private static String uid;
	private static String username;
	
	public static void setUsername(String newUsername) {
		username = newUsername;
	}
	public static String getUsername() {
		return username;
	}
	
	public static String getUid() {
		return uid;
	}

	public static void setUid(String uid) {
		UserCredentials.uid = uid;
	}
	
	

}
