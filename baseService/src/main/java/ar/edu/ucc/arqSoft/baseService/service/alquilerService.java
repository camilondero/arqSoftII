package ar.edu.ucc.arqSoft.baseService.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.baseService.dao.alquilerDao;
import ar.edu.ucc.arqSoft.baseService.dao.peliculaDao;
import ar.edu.ucc.arqSoft.baseService.dao.socioDao;
import ar.edu.ucc.arqSoft.baseService.dto.AlquilerRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.AlquilerResponseDto;
import ar.edu.ucc.arqSoft.baseService.model.Alquiler;




@Service
@Transactional
public class alquilerService {
	
	@Autowired
	private alquilerDao AlquilerDao;
	
	@Autowired
	private peliculaDao PeliculaDao;
	
	@Autowired
	private socioDao SocioDao;
	
	
	public AlquilerResponseDto registrarAlquiler (AlquilerRequestDto dto) {
		
		Alquiler alquiler = new Alquiler();
		
		alquiler.setFechaAlquiler(Calendar.getInstance().getTime());
		alquiler.setPelicula(PeliculaDao.load(dto.getPeliculaId()));
		alquiler.setSocio(SocioDao.load(dto.getSocioId()));
		
		AlquilerDao.insert(alquiler);
		
		AlquilerResponseDto response = new AlquilerResponseDto();
		
		response.setApellido(alquiler.getSocio().getApellido());
		response.setTitulo(alquiler.getPelicula().getTitulo());
		response.setFecha(alquiler.getFechaAlquiler());
		
		return response;
		
	}
	

	
}

