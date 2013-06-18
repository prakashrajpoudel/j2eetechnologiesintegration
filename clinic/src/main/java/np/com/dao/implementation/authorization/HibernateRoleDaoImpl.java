package np.com.dao.implementation.authorization;
import np.com.business.authorization.Role;
import np.com.dao.authorization.RoleDao;
import np.com.dao.implementation.clinic.BaseHibernateSearchableCRUD;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author bishu
 * 
 */

@Transactional
public class HibernateRoleDaoImpl extends BaseHibernateSearchableCRUD<Role> implements RoleDao {
}

