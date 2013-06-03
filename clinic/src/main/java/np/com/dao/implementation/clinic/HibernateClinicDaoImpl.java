package np.com.dao.implementation.clinic;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import np.com.business.clinic.Clinic;
import np.com.dao.clinic.ClinicDao;
import np.com.dao.util.clinic.ClinicSearchEntityConfiguration;

@Transactional
public class HibernateClinicDaoImpl extends BaseHibernateSearchableCRUD<Clinic> implements ClinicDao {

	private SessionFactory sessionFactory;
	private ClinicSearchEntityConfiguration searchCriteria;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Clinic> getAllClinics(ClinicSearchEntityConfiguration searchCriteria) {
		this.searchCriteria = searchCriteria;
		return getAllByCriteria();
	}

	/**
	 * Override in subclass if any clause is required to getAll
	 */
	protected String getQueryClause() {
		StringBuilder whereClause = new StringBuilder();
		whereClause.append(" where name like :clinicname");
		return whereClause.toString();
	}
	
	/**
	 * If queryClause is extend then associate parameter is set here.
	 */
	protected void setParameters(Query query) {
		query.setParameter("clinicname", "%" + searchCriteria.getName() + "%");
	}

}
