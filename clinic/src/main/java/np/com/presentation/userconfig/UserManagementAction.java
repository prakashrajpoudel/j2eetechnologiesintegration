package np.com.presentation.userconfig;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import np.com.business.userconfig.User;
import np.com.service.clinic.ClinicService;
import np.com.service.userconfig.UserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author bishu
 * 
 */
public class UserManagementAction extends ActionSupport implements
		ModelDriven<User> {
	private static final long serialVersionUID = 1L;
	private UserService userService;
	private User user = new User();
	private List<User> userList = new ArrayList<User>();
	private ClinicService clinicService;

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Resource
	public void setClinicService(ClinicService clinicService) {
		this.clinicService = clinicService;
	}

	public String saveUser() throws Exception {
		user.setCreatedDt(new Date());
		userService.saveUser(user);
		return SUCCESS;
	}

	public String listUser() throws Exception {
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
