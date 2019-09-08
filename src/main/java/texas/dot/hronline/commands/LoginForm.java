package texas.dot.hronline.commands;

import javax.validation.constraints.NotNull;

public class LoginForm {
	@NotNull
	private String userid;
	@NotNull
	private String password;
	
	private String errorMsg; 
	
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
