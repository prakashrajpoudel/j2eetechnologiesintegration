package np.com.presentation.authentication;

import com.opensymphony.xwork2.ActionSupport;

public class LoginController extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String message;
	private String error;
	
	public String login() throws Exception {
		return SUCCESS;
	}
	
	public String loginFailed() throws Exception {
		error="true";
		return SUCCESS;
	}
	
	public String getMessage(){
		return message;
	}
	
	public String getError(){
		return error;
	}
	

}
