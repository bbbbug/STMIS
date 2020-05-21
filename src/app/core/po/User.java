package app.core.po;

public class User {
	private String username;
	private String password;
	private String jsbs;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJsbs() {
		return jsbs;
	}
	public void setJsbs(String jsbs) {
		this.jsbs = jsbs;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "员工姓名:"+username+",密码:"+password+",角色标识:"+jsbs;
	}
}
