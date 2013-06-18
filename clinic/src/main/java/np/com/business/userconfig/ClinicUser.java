package np.com.business.userconfig;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import np.com.business.clinic.Clinic;

@Entity
@Table(name = "clinic_user")
@AssociationOverrides({
		@AssociationOverride(name = "pk.user", joinColumns = @JoinColumn(name = "user_id")),
		@AssociationOverride(name = "pk.clinic", joinColumns = @JoinColumn(name = "clinic_id")) })
public class ClinicUser implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date mappedDate;
	private Date updatedDate;
	private String status;
	private int updatedBy;
	private int createdBy;

	private ClinicUserId pk = new ClinicUserId();

	@EmbeddedId
	public ClinicUserId getPk() {
		return pk;
	}

	public void setPk(ClinicUserId pk) {
		this.pk = pk;
	}

	@Column(name = "mapped_dt")
	public Date getMappedDate() {
		return mappedDate;
	}

	public void setMappedDate(Date mappedDate) {
		this.mappedDate = mappedDate;
	}

	@Column(name = "updated_dt")
	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Column(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "updated_by")
	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Column(name = "created_by")
	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	@Transient
	public User getUser() {
		return getPk().getUser();
	}

	public void setUser(User user) {
		getPk().setUser(user);
	}

	@Transient
	public Clinic getClinic() {
		return getPk().getClinic();
	}

	public void setClinic(Clinic clinic) {
		getPk().setClinic(clinic);
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		ClinicUser that = (ClinicUser) o;

		if (getPk() != null ? !getPk().equals(that.getPk())
				: that.getPk() != null)
			return false;

		return true;
	}

	public int hashCode() {
		return (getPk() != null ? getPk().hashCode() : 0);
	}
}
