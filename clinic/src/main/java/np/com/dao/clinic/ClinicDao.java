/**
 * 
 */
package np.com.dao.clinic;

import java.util.List;

import np.com.business.clinic.Clinic;
import np.com.dao.util.clinic.ClinicSearchEntityConfiguration;

/**
 * @author prakash.poudel
 *
 */
public interface ClinicDao extends SearchableCRUD<Clinic> {
	
	public List<Clinic> getAllClinics(ClinicSearchEntityConfiguration searchCriteria);

}
