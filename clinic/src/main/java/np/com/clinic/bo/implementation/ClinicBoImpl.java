/**
 * 
 */
package np.com.clinic.bo.implementation;

import java.util.List;

import javax.annotation.Resource;

import np.com.clinic.bo.ClinicBo;
import np.com.clinic.business.Clinic;
import np.com.clinic.dao.ClinicDao;

/**
 * @author prakash.poudel
 *
 */
public class ClinicBoImpl implements ClinicBo {
	
	private ClinicDao clinicDao;
	
	/* (non-Javadoc)
	 * @see np.com.clinic.bo.ClinicBo#getAllClinics()
	 */
	@Override
	public List<Clinic> getAllClinics() {
		return clinicDao.getAllClinics();
	}
	
//	@Resource
	public void setClinicDao(ClinicDao clinicDao) {
		this.clinicDao = clinicDao;
	}
	
	@Override
	public void saveClinic(Clinic clinic) {
		clinicDao.saveClinic(clinic);
	}
}
