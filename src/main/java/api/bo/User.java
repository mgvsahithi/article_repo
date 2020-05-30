package api.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID", columnDefinition = "BIGINT(20)")
	private Long id;
	
	@Column(name = "EMAIL", columnDefinition = "VARCHAR(50)")
	private String email;
	
	@Column(name = "Address", columnDefinition = "VARCHAR(50)")
	private String address;
	
	@Column(name = "USERNAME", columnDefinition = "VARCHAR(50)")
	private String userName;
	
	@Column(name = "PASSWORD", columnDefinition = "VARCHAR(50)")
	private String password;
	
	@Column(name = "ACCESS_TOKEN", columnDefinition = "VARCHAR(50)")
	private String accessToken;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

}
