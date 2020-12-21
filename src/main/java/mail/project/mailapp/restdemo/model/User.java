package mail.project.mailapp.restdemo.model;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUser;
	
	@Column(name= "nombre")
	private String nombre;
	

	@Column(name= "apellidos")
	private String apellido;
	
	@Column(name = "email", nullable = true, unique = true)
	private String email;
	
	@Column (name="password")
	private String pwd;
	
	
	public User(Integer idUser, String nombre, String apellido, String email, String pwd) {
		super();
		this.idUser = idUser;
		this.nombre = nombre;
		this.apellido = apellido;
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


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return pwd;
	}


	public void setPassword(String pwd) {
		this.pwd = pwd;
	}
	
	
	

}
