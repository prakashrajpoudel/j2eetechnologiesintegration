/**
 * 
 */
package np.com.service.implementation.clinic;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import np.com.business.clinic.Clinic;
import np.com.dao.clinic.ClinicDao;
import np.com.dao.util.clinic.ClinicSearchEntityConfiguration;
import np.com.service.clinic.ClinicService;

/**
 * @author prakash.poudel
 *
 */
@Transactional
public class ClinicServiceImpl implements ClinicService {
	
	private ClinicDao clinicDao;
	
	/* (non-Javadoc)
	 * @see np.com.clinic.bo.ClinicBo#getAllClinics()
	 */
	@Override
	public List<Clinic> getAllClinics(ClinicSearchEntityConfiguration searchCriteria) {
		if (searchCriteria == null) {
			return clinicDao.getAll();
		}
		return clinicDao.getAllClinics(searchCriteria);
	}
	
	@Resource
	public void setClinicDao(ClinicDao clinicDao) {
		this.clinicDao = clinicDao;
	}
	
	@Override
	public void saveClinic(Clinic clinic) {
		clinicDao.save(clinic);
	}
	
	@Override
	public void deleteClinic(long id) {
		clinicDao.delete(getClinicById(id));
	}

	@Override
	public Clinic getClinicById(long id) {
		return clinicDao.getById(id);
	}
}
