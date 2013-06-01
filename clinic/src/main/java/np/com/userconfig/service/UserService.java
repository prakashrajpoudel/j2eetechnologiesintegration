package np.com.userconfig.service;

import java.util.List;
import np.com.userconfig.business.User;

/**
 * 
 * @author bishu
 *
 */

public interface  UserService {
	
	public List<User> getAllUsers();
	
	public void saveUser(User user);

}
