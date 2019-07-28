package entity;

public class UserKey {
   
    private String uid;

    private String username;

    private String password;
    
    private String utag;

    public String getUid() {
        return uid;
    }

  
    public String getUtag() {
		return utag;
	}


	public void setUtag(String utag) {
		this.utag = utag;
	}


	public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

   
    public String getUsername() {
        return username;
    }

 
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

  
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}