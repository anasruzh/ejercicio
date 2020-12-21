package mail.project.mailapp.restdemo.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginPayload {
	
	@JsonProperty(value = "id_login")
    private Integer idLogin;

    @NotBlank
    @NotNull
    @JsonProperty(value = "login")
    private String login;

   
    @JsonProperty(value = "password")
    private Integer pwd;


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


	public Integer getPwd() {
		return pwd;
	}


	public void setPwd(Integer pwd) {
		this.pwd = pwd;
	}
    


}
