/**
 * 
 */
package np.com.business.clinic;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToMany;

import np.com.business.userconfig.User;
/**
 * @author prakash.poudel
 *
 */
 @Entity
 @Table(name="clinic")
public class Clinic implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private String code;
	private Set<User> userList = new HashSet<User>(0);
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "clinicList")
	public Set<User> getUserList() {
		return userList;
	}


	public void setUserList(Set<User> userList) {
		this.userList = userList;
	}
	

}
