package np.com.userconfig.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import np.com.clinic.bo.ClinicBo;
import np.com.clinic.business.Clinic;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 
 * @author bishu
 *
 */
public class UserController extends ActionSupport implements ModelDriven<Clinic> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Clinic> clinicList = new ArrayList<Clinic>();
	private ClinicBo clinicBo;
	private Clinic clinic = new Clinic();
	

	@Resource
	public void setClinicBo(ClinicBo clinicBo){
		this.clinicBo = clinicBo;
	}
	
	public List<Clinic> getClinicList() {
		return clinicList;
	}
	
	public String listClinic() throws Exception {
		clinicList = clinicBo.getAllClinics();
		return SUCCESS;
	}
	
	public String addClinic() throws Exception {
		return SUCCESS;
	}
	
	public String saveClinic() throws Exception {
		clinicBo.saveClinic(clinic);
		return SUCCESS;
	}
	@Override
	public Clinic getModel() {
		return clinic;
	}

	public Clinic getClinic() {
		return clinic;
	}
	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}
	
}
