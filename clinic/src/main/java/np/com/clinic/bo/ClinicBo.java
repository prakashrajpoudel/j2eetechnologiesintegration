package np.com.clinic.bo;

import java.util.List;

import np.com.clinic.business.Clinic;
import np.com.clinic.dao.ClinicDao;

public interface ClinicBo {
	
	public List<Clinic> getAllClinics();
	
	public void setClinicDao(ClinicDao clinicDao);
	
	public void saveClinic(Clinic clinic);

}
