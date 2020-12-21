package mail.project.mailapp.restdemo.model;
import javax.persistence.*;

@Entity
@Table(name="mensaje")
public class Mensaje {
	
	private Integer idMensaje;
	private String from;
	private String to;
	private String bcco;
	private String subject; // tiene que ser una lista oculta de users adjuntos 
	private String content; // tiene que tener formato cuqui HTML+CSS como plantilla
	
	
	public Mensaje(Integer idMensaje, String from, String to, String bcco, String subject, String content) {
		super();
		this.idMensaje = idMensaje;
		this.from = from;
		this.to = to;
		this.bcco = bcco;
		this.subject = subject;
		this.content = content;
	}                 


	public Integer getIdMensaje() {
		return idMensaje;
	}


	public void setIdMensaje(Integer idMensaje) {
		this.idMensaje = idMensaje;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getBcco() {
		return bcco;
	}


	public void setBcco(String bcco) {
		this.bcco = bcco;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}
	
	
	

}
