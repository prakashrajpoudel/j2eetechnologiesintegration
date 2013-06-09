package np.com.dao.implementation.userconfig;

import java.util.List;
import javax.annotation.Resource;

import np.com.business.userconfig.User;
import np.com.dao.implementation.clinic.BaseHibernateSearchableCRUD;
import np.com.dao.userconfig.UserDao;
import np.com.dao.util.userconfig.UserSearchEntityConfiguration;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author bishu1d
 * 
 */

@Transactional
public class HibernateUserDaoImpl extends BaseHibernateSearchableCRUD<User> implements UserDao {

	private SessionFactory sessionFactory;
	private UserSearchEntityConfiguration searchCriteria;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<User> getAllUsers(UserSearchEntityConfiguration searchCriteria) {
		this.searchCriteria = searchCriteria;
		return getAllByCriteria();
	}
	
	/**
	 * Override in subclass if any clause is required to getAll
	 */
	protected String getQueryClause() {
		StringBuilder whereClause = new StringBuilder();
		whereClause.append(" where fname like :firstName");
		return whereClause.toString();
	}
	
	/**
	 * If queryClause is extend then associate parameter is set here.
	 */
	protected void setParameters(Query query) {
		query.setParameter("firstName", "%" + searchCriteria.getFirstName() + "%");
	}

}
