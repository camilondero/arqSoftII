package ar.edu.ucc.arqSoft.baseService.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ar.edu.ucc.arqSoft.common.model.GenericObject;




@Entity
@Table (name="PELICULA")

public class Pelicula extends GenericObject {

	@NotNull
	@Size(min = 1, max = 250)
	@Column(name = "TITULO")
	private String titulo;

	@NotNull
	@Size(min = 1, max = 250)
	@Column(name = "SINOPSIS")
	private String sinopsis;
	
	@NotNull
	@Column(name = "ANIO")
	private int anio;
	
	@Enumerated(value = EnumType.ORDINAL)
	@Column(name = "GENERO")
	private Genero genero;
	
	@OneToMany(mappedBy="pelicula", fetch = FetchType.LAZY)
	private Set<Alquiler> alquileres;
	
	
	public Set<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(Set<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
}
