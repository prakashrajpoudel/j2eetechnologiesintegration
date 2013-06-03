package np.com.service.userconfig;

import java.util.List;

import np.com.business.userconfig.User;

/**
 * 
 * @author bishu
 *
 */

public interface  UserService {
	
	public List<User> getAllUsers();
	
	public void saveUser(User user);

}
