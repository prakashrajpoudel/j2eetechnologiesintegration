package np.com.business.userconfig;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import np.com.business.clinic.Clinic;

/**
 * 
 * @author bishu
 * simple user pojo
 */
@Entity
@Table(name="user")
public class User {
	
	private int user_id;
	private String fname;
	private String mname;
	private String lname;
	private String status;
	private Date createdDt;
	private int createdBy;
	
	private Set<Clinic> clinicList = new HashSet<Clinic>(0);

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="user_id")
	public int getUser_id() {
		return user_id;
	}
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Column(name="created_by")
	public int getCreatedBy() {
		return createdBy;
		
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	
	@Column(name="created_dt")
	public Date getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}


	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "clinic_user", joinColumns = { 
			@JoinColumn(name = "user_id") }, 
			inverseJoinColumns = { @JoinColumn(name = "id"
					) })
	public Set<Clinic> getClinicList() {
		return clinicList;
	}

	public void setClinicList(Set<Clinic> clinicList) {
		this.clinicList = clinicList;
	}
	
	
}
