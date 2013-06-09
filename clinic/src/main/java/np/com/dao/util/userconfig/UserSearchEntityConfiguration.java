package np.com.dao.util.userconfig;

import np.com.dao.util.clinic.BaseSearchEntityConfiguration;

public class UserSearchEntityConfiguration extends
		BaseSearchEntityConfiguration {

	private String firstName;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
