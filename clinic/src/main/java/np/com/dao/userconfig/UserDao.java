package np.com.dao.userconfig;

import java.util.List;

import np.com.business.userconfig.User;
import np.com.dao.clinic.SearchableCRUD;
import np.com.dao.util.userconfig.UserSearchEntityConfiguration;

/**
 * 
 * @author bishu
 * 
 */

public interface UserDao extends SearchableCRUD<User> {

		public List<User> getAllUsers(UserSearchEntityConfiguration searchCriteria);

}
