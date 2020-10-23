package ar.edu.ucc.arqsoft.WebService.dao;

import java.util.List;

import ar.edu.ucc.arqsoft.WebService.model.Pelicula;

public interface peliculaDao extends GenericDao<Pelicula, Long>{
	
	public List<Pelicula> findByName(String titulo);


}
