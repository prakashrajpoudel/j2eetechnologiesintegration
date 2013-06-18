package np.com.business.userconfig;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import np.com.business.clinic.Clinic;

@Embeddable
public class ClinicUserId implements Serializable {
	private static final long serialVersionUID = 1L;
	private User user;
	private Clinic clinic;

	@ManyToOne
	@JoinColumn(name="user_id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name="clinic_id")
	public Clinic getClinic() {
		return clinic;
	}
	

	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		ClinicUserId that = (ClinicUserId) o;

		if (clinic != null ? !clinic.equals(that.clinic) : that.clinic != null)
			return false;
		if (user != null ? !user.equals(that.user) : that.user != null)
			return false;

		return true;
	}

	public int hashCode() {
		int result;
		result = (user != null ? user.hashCode() : 0);
		result = 31 * result + (clinic != null ? clinic.hashCode() : 0);
		return result;
	}

}
