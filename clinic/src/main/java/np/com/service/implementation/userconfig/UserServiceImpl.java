package np.com.service.implementation.userconfig;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import np.com.business.userconfig.User;
import np.com.dao.userconfig.UserDao;
import np.com.dao.util.userconfig.UserSearchEntityConfiguration;
import np.com.service.userconfig.UserService;

@Transactional
public class UserServiceImpl implements UserService {

	private UserDao userDao;


	public UserDao getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> getAllUsers(UserSearchEntityConfiguration searchCriteria) {
		if (searchCriteria != null) { 
		   return userDao.getAllUsers(searchCriteria);
		}else {
			return userDao.getAll();
		}
	}

	@Override
	public void saveUser(User user) {
		userDao.save(user);
	}

	@Override
	public User getUserById(long id) {
		return userDao.getById(id);
	}

	@Override
	public void deleteUser(long id) {
		User user = userDao.getById(id);
		userDao.delete(user);
	}
	
}
