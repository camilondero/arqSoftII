package ar.edu.ucc.arqsoft.WebService.dao;

import java.util.List;

import ar.edu.ucc.arqsoft.WebService.model.Socio;

public interface socioDao extends GenericDao< Socio, Long> {

	public List<Socio> findByName(String nombre);
}
