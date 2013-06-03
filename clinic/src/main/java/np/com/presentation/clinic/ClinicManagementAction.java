package np.com.presentation.clinic;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.ServletActionContext;

import np.com.business.clinic.Clinic;
import np.com.dao.util.clinic.ClinicSearchEntityConfiguration;
import np.com.service.clinic.ClinicService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Use complete struts action
 **/
public class ClinicManagementAction extends ActionSupport implements ModelDriven<Clinic> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Clinic> clinicList = new ArrayList<Clinic>();
	private ClinicService clinicService;
	private Clinic clinic = new Clinic();
	

	@Resource
	public void setClinicService(ClinicService clinicService){
		this.clinicService = clinicService;
	}
	
	public List<Clinic> getClinicList() {
		return clinicList;
	}
	
	public String listClinic() throws Exception {
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		String stringName = request.getParameter("name");
		if (StringUtils.isEmpty(stringName)) { 
    		clinicList = clinicService.getAllClinics(null);
		}else {
			ClinicSearchEntityConfiguration searchCriteria = new ClinicSearchEntityConfiguration();
			searchCriteria.setName(stringName);
			clinicList = clinicService.getAllClinics(searchCriteria);
		}
		return SUCCESS;
	}
	
	public String addClinic() throws Exception {
		return SUCCESS;
	}
	
	public String editClinic() throws Exception {
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		long id = Long.parseLong(request.getParameter("id"));
		clinic = clinicService.getClinicById(id);
		return SUCCESS;
	}
	
	public String deleteClinic() throws Exception {
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		long id = Long.parseLong(request.getParameter("id"));
		clinicService.deleteClinic(id);
		return SUCCESS;
	}
	
	public String saveClinic() throws Exception {
		clinicService.saveClinic(clinic);
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
