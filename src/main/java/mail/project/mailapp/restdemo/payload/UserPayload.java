package mail.project.mailapp.restdemo.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPayload {

	@JsonProperty(value = "id_user")
	private Integer idUser;
	
	@JsonProperty(value = "nombre")
	private String nombre;
	
	@JsonProperty(value = "apellidos")
	private String apellidos;

    @NotNull
    @JsonProperty(value = "email")
	private String email;
    
    @JsonProperty(value = "password")
	private String pwd;

	public UserPayload(Integer idUser, String nombre, String apellidos, @NotBlank @NotNull String email, String pwd) {
		super();
		this.idUser = idUser;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.pwd = pwd;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
    
    

	    
}
