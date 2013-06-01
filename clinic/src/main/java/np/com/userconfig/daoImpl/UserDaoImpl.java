package np.com.userconfig.daoImpl;

import java.util.List;
import javax.annotation.Resource;

import np.com.userconfig.business.User;
import np.com.userconfig.dao.UserDao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author bishu1d
 * 
 */

@Transactional
public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<User> getAllUsers() {
		Query query = getSessionFactory().getCurrentSession().createQuery(
				"from " + User.class.getName());
		return query.list();
	}

	@Override
	public void saveUser(User user) {
		getSessionFactory().getCurrentSession().saveOrUpdate(user);
	}

}
