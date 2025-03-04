package ar.edu.ucc.arqSoft.baseService.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ar.edu.ucc.arqSoft.common.model.GenericObject;



@Entity
@Table(name = "SOCIO")
public class Socio extends GenericObject{

	@NotNull
	@Size(min = 1, max = 250)
	@Column(name = "NOMBRE")
	private String nombre;
	
	@NotNull
	@Size(min = 1, max = 250)
	@Column(name = "APELLIDO")
	private String apellido;
	
	@NotNull
	@Size(min = 1, max = 250)
	@Column(name = "DNI")
	private String dni;
	
	@NotNull
	@Size(min = 1, max = 250)
	@Column(name = "EMAIL")
	private String email;
	
	@OneToMany(mappedBy="socio", fetch = FetchType.LAZY)
	private Set<Alquiler> alquileres;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Set<Alquiler> getAlquileres() {
		return alquileres;
	}
	public void setAlquileres(Set<Alquiler> alquileres) {
		this.alquileres = alquileres;
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
	
	
}
