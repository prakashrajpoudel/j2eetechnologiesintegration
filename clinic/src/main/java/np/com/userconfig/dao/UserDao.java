package np.com.userconfig.dao;

import java.util.List;
import np.com.userconfig.business.User;

/**
 * 
 * @author bishu
 * 
 */

public interface UserDao {

		public List<User> getAllUsers();

		public void saveUser(User user);

}
