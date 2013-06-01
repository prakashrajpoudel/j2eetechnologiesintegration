package np.com.userconfig.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import np.com.userconfig.business.User;
import np.com.userconfig.service.UserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 
 * @author bishu
 * 
 */
public class UserController extends ActionSupport implements ModelDriven<User> {
	private static final long serialVersionUID = 1L;
	private UserService userService;
	private User user;
	private List<User> userList = new ArrayList<User>();

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String saveUser() throws Exception {
//		userService.saveUser(user);
		return SUCCESS;
	}
	
	public String listUser() throws Exception{
		userList = userService.getAllUsers();
		return SUCCESS;
	}
	
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public String addUser() throws Exception {
		return SUCCESS;
	}

	@Override
	public User getModel() {
		return user;
	}

}
