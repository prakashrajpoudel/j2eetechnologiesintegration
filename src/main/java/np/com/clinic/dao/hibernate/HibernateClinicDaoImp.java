package np.com.clinic.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import np.com.clinic.business.Clinic;
import np.com.clinic.dao.ClinicDao;

public class HibernateClinicDaoImp extends HibernateDaoSupport implements ClinicDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Clinic> getAllClinics() {
		return getHibernateTemplate().find("from " + Clinic.class.getName());
	}

}
