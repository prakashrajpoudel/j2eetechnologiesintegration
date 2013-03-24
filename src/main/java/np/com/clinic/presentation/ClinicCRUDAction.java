package np.com.clinic.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import np.com.clinic.bo.ClinicBo;
import np.com.clinic.business.Clinic;

import com.opensymphony.xwork2.ModelDriven;

/**
 * Use complete struts action
 **/
@Deprecated
public class ClinicCRUDAction implements ModelDriven {

	List<Clinic> clinicList = new ArrayList<Clinic>();
	ClinicBo clinicBo;
	
	@Override
	public Object getModel() {
		return null;
	}

	@Resource
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
