package ar.edu.ucc.arqSoft.baseService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.baseService.dto.PeliculasResponseDto;
import ar.edu.ucc.arqSoft.baseService.model.Pelicula;
import ar.edu.ucc.arqSoft.common.dto.ModelDtoConverter;
import ar.edu.ucc.arqSoft.baseService.dao.peliculaDao;





@Service
@Transactional
public class peliculasService {
	
	@Autowired
	private peliculaDao peliculaDao;

	public PeliculasResponseDto getPeliculaById(Long id) {
		Pelicula pelicula = peliculaDao.load(id);
				
		PeliculasResponseDto dto = new PeliculasResponseDto();
		dto.setTitulo(pelicula.getTitulo());
		return dto;
		
	}
	
	
	public List<PeliculasResponseDto> getAllPeliculas() {
		
		List<Pelicula> peliculas = peliculaDao.getAll();
		
		List<PeliculasResponseDto> response = new ArrayList<PeliculasResponseDto>();
		 
		for (Pelicula pelicula : peliculas) {
			response.add((PeliculasResponseDto) new ModelDtoConverter().convertToDto(pelicula, new PeliculasResponseDto()));
		}
		
		return response;
	}
	
	


}
