package mail.project.mailapp.restdemo.payload;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MensajePayload {
	
	@JsonProperty(value = "id_mensaje")
	private Integer idMensaje;
	
	@NotBlank
	@JsonProperty(value = "from")
	private String from;

	@NotBlank
	@JsonProperty(value = "to")
	private String to;
	

	@NotBlank
	@JsonProperty(value = "bcco")
	private String bcco;
	

	@NotBlank
	@JsonProperty(value = "subject")
	private String subject;
	

	@NotBlank
	@JsonProperty(value = "from")
	private String content; //HTML crear interfaz con la pag
	
	

}
