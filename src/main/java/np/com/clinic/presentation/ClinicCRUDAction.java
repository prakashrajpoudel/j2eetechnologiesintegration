package np.com.clinic.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import np.com.clinic.bo.ClinicBo;
import np.com.clinic.business.Clinic;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Use complete struts action
 **/
public class ClinicCRUDAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Clinic> clinicList = new ArrayList<Clinic>();
	private ClinicBo clinicBo;
	

//	@Resource
	public void setClinicBo(ClinicBo clinicBo){
		this.clinicBo = clinicBo;
	}
	
	public List<Clinic> getClinicList() {
		return clinicList;
	}
	
	public String listClinic() throws Exception {
		clinicList = clinicBo.getAllClinics();
		return "success";
	}
}
