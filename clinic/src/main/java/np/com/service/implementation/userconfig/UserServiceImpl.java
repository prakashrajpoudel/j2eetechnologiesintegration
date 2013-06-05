package np.com.service.implementation.userconfig;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import np.com.business.userconfig.User;
import np.com.dao.userconfig.UserDao;
import np.com.service.userconfig.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	private User user;
	


	public UserDao getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> myList= new ArrayList<User>();
		User user1= new User();
		user1.setFname("bishu");
		myList.add(user1);
		return userDao.getAllUsers();
//		return myList;
	}

	@Override
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}