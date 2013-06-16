package np.com.presentation.userconfig;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.ServletActionContext;

import np.com.business.userconfig.User;
import np.com.dao.util.userconfig.UserSearchEntityConfiguration;
import np.com.service.userconfig.UserService;
import com.opensymphony.xwork2.ActionContext;
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

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String editUser() throws Exception {
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		long id = Long.parseLong(request.getParameter("id"));
		user = userService.getUserById(id);
		return SUCCESS;
	}
	
	public String deleteUser() throws Exception {
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		long id = Long.parseLong(request.getParameter("id"));
		userService.deleteUser(id);
		return SUCCESS;
	}
	
	public String saveUser() throws Exception {
		user.setCreatedDt(new Date());
		userService.saveUser(user);
		return SUCCESS;
	}

	public String listUser() throws Exception {
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		String stringName = request.getParameter("name");
		if (StringUtils.isNotEmpty(stringName)) {
		   UserSearchEntityConfiguration searchCriteria = new UserSearchEntityConfiguration();
		   searchCriteria.setFirstName(stringName);
		   userList = userService.getAllUsers(searchCriteria); 
		} else {
		   userList = userService.getAllUsers(null);
		}
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
