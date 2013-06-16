package np.com.service.implementation.authorization;

import java.util.List;

import javax.annotation.Resource;

import np.com.business.authorization.Role;
import np.com.dao.authorization.RoleDao;
import np.com.service.authorization.RoleService;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class RoleServiceImpl implements RoleService {
	private RoleDao roleDao;

	@Resource
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	@Override
	public void saveRole(Role role) {

		roleDao.save(role);
	}

	@Override
	public void deleteRole(long id) {
		roleDao.delete(getRoleById(id));
	}

	@Override
	public Role getRoleById(long id) {
		return roleDao.getById(id);
	}

	@Override
	public List<Role> getAllRoles() {
		return roleDao.getAll();
	}

}
