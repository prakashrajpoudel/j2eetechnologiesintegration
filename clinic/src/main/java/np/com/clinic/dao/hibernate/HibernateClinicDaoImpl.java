package np.com.clinic.dao.hibernate;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import np.com.clinic.business.Clinic;
import np.com.clinic.dao.ClinicDao;

@Transactional
public class HibernateClinicDaoImpl implements ClinicDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Clinic> getAllClinics() {
		Query query = getSessionFactory().getCurrentSession().createQuery(
				"from " + Clinic.class.getName());
		return query.list();
	}
	
	@Override
	public void saveClinic(Clinic clinic) {
		getSessionFactory().getCurrentSession().saveOrUpdate(clinic);
	}

}
