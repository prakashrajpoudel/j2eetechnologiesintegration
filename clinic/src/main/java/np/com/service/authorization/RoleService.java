package np.com.service.authorization;

import java.util.List;

import np.com.business.authorization.Role;

public interface RoleService {

	public void saveRole(Role role);

	public void deleteRole(long id);

	public Role getRoleById(long id);
	
	public List<Role> getAllRoles();
}
