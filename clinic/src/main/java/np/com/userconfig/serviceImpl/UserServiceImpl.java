package np.com.userconfig.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import np.com.userconfig.business.User;
import np.com.userconfig.dao.UserDao;
import np.com.userconfig.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDaoImpl;
	private User user;

	@Resource
	public void setUserDaoImpl(UserDao userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

	@Override
	public List<User> getAllUsers() {
		return userDaoImpl.getAllUsers();
	}

	@Override
	public void saveUser(User user) {
		userDaoImpl.saveUser(user);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}
