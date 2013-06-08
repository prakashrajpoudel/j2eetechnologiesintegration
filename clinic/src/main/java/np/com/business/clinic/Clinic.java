/**
 * 
 */
package np.com.business.clinic;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import np.com.business.userconfig.ClinicUser;

/**
 * @author prakash.poudel
 * 
 */
@Entity
@Table(name = "clinic")
public class Clinic implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private String code;
	private Set<ClinicUser> clinicUserList = new HashSet<ClinicUser>(0);

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.clinic", cascade = CascadeType.ALL)
	public Set<ClinicUser> getClinicUserList() {
		return clinicUserList;
	}

	public void setClinicUserList(Set<ClinicUser> clinicUserList) {
		this.clinicUserList = clinicUserList;
	}

}
