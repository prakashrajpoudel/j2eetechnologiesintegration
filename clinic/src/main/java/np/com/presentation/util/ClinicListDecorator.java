package np.com.presentation.util;

import np.com.business.clinic.Clinic;

import org.displaytag.decorator.TableDecorator;

public class ClinicListDecorator extends TableDecorator {

	public String getName() {
		Clinic clinic = (Clinic)getCurrentRowObject();
		return clinic.getName();
	}
	
	public String getCode() {
		Clinic clinic = (Clinic)getCurrentRowObject();
		return clinic.getCode();
	}
	//TO-DO : rename method according to its function
	// Make this implementation more manageable
	public String getLinks() {
		Clinic clinic = (Clinic)getCurrentRowObject();
		StringBuilder links = new StringBuilder();
		links.append("<span class='editLink'><a href='/clinic/editClinic?id=");
		links.append(clinic.getId());
		links.append("'>Edit</a></span>");
		links.append("&nbsp;<span class='deleteLink'><a href='/clinic/deleteClinic?id=");
		links.append(clinic.getId());
		links.append("'>Delete</a></span>");
		//<a href="/clinic/editUser?id=1">Edit</a>
		return links.toString();
	}
}
