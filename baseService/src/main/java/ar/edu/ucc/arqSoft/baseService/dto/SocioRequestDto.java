package ar.edu.ucc.arqSoft.baseService.dto;

import ar.edu.ucc.arqSoft.common.dto.DtoEntity;

public class SocioRequestDto implements DtoEntity {
	
	private String name;
	
	private String apellido;
	
	private String dni;
	
	private String email;

	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
