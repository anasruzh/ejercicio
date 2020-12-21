package mail.project.mailapp.restdemo.model;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import org.springframework.data.annotation.Id;

@Entity
@Table(name="login")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_login")
	private Integer idLogin;
	
	@Column(name = "login", nullable = false, unique = true)
    private String login;
	
	@Column(name = "password")
    private String password;
	
	
	public Integer getIdLogin() {
		return idLogin;
	}

	public void setIdLogin(Integer idLogin) {
		this.idLogin = idLogin;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getDocument() {
		return password;
	}

	public void setDocument(String password) {
		this.password = password;
	}



}
