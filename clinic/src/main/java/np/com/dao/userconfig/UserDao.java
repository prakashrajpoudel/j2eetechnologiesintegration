package np.com.dao.userconfig;

import java.util.List;

import np.com.business.userconfig.User;

/**
 * 
 * @author bishu
 * 
 */

public interface UserDao {

		public List<User> getAllUsers();

		public void saveUser(User user);

}
