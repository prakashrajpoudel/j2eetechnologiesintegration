package np.com.service.clinic;

import java.util.List;

import np.com.business.clinic.Clinic;
import np.com.dao.clinic.ClinicDao;
import np.com.dao.util.clinic.ClinicSearchEntityConfiguration;
import np.com.exception.BaseException;

public interface ClinicService {
	
	public List<Clinic> getAllClinics(ClinicSearchEntityConfiguration searchCriteria);
	
	public void setClinicDao(ClinicDao clinicDao);
	
	public void saveClinic(Clinic clinic) throws BaseException, Exception;
	
	public void deleteClinic(long id);
	
	public Clinic getClinicById(long id);

}
