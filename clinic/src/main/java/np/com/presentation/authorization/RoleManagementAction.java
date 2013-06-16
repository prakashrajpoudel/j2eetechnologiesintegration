package np.com.presentation.authorization;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import np.com.business.authorization.Role;
import np.com.service.authorization.RoleService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RoleManagementAction extends ActionSupport implements
		ModelDriven<Role> {
	private static final long serialVersionUID = 1L;
	private RoleService roleService;
	private Role role = new Role();
	private List<Role> roleList = new ArrayList<Role>();

	@Resource
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	public String saveRole() throws Exception {
		roleService.saveRole(role);
		return SUCCESS;
	}
	
	public String addRole() throws Exception {
		return SUCCESS;
	}

	public String editRole() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		long id = Long.parseLong(request.getParameter("roleId"));
		role = roleService.getRoleById(id);
		return SUCCESS;
	}

	public String deleteRole() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		long id = Long.parseLong(request.getParameter("roleId"));
		roleService.deleteRole(id);
		return SUCCESS;
	}

	public String listRole() throws Exception {
		roleList = roleService.getAllRoles();
		return SUCCESS;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public Role getModel() {
		return role;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

}
