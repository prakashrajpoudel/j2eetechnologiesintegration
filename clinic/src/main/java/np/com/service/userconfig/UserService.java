package np.com.service.userconfig;

import java.util.List;

import np.com.business.userconfig.User;
import np.com.dao.util.userconfig.UserSearchEntityConfiguration;

/**
 * 
 * @author bishu
 *
 */

public interface  UserService {
	
	public List<User> getAllUsers(UserSearchEntityConfiguration searchCriteria);
	
	public void saveUser(User user);
	
	public User getUserById(long id);
	
	public void deleteUser(long id);

}
