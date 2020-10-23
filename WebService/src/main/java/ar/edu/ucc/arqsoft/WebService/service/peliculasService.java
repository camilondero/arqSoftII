package ar.edu.ucc.arqsoft.WebService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqsoft.WebService.dto.ModelDtoConverter;
import ar.edu.ucc.arqsoft.WebService.dto.PeliculasRequestDto;
import ar.edu.ucc.arqsoft.WebService.dto.PeliculasResponseDto;
import ar.edu.ucc.arqsoft.WebService.model.Pelicula;
import ar.edu.ucc.arqsoft.WebService.dao.peliculaDao;


@Service
@Transactional
public class peliculasService {
	
	@Autowired
	private peliculaDao peliculaDao;

	public PeliculasResponseDto getStateById(Long id) {
		Pelicula pelicula = peliculaDao.load(id);
				
		PeliculasResponseDto response = (PeliculasResponseDto) new ModelDtoConverter().convertToDto(pelicula, new PeliculasResponseDto());	
		return response;
	}
	
	public List<PeliculasResponseDto> getAllStates() {
		List<Pelicula> peliculas = peliculaDao.getAll();
		
		List<PeliculasResponseDto> response = new ArrayList<PeliculasResponseDto>();
		 
		for (Pelicula pelicula : peliculas) {
			response.add((PeliculasResponseDto) new ModelDtoConverter().convertToDto(pelicula, new PeliculasResponseDto()));
		}
		
		return response;
	}
	
	
	public PeliculasResponseDto insertPeliculas(PeliculasRequestDto request) {
		
		Pelicula pelicula = (Pelicula) new ModelDtoConverter().convertToEntity(new Pelicula(), request);
		
		peliculaDao.insert(pelicula);
		
		PeliculasResponseDto response = (PeliculasResponseDto) new ModelDtoConverter().convertToDto(pelicula, new PeliculasResponseDto());	
		
		return response;
	}

}
