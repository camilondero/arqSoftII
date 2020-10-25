package ar.edu.ucc.arqSoft.baseService.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.baseService.dao.socioDao;
import ar.edu.ucc.arqSoft.baseService.dto.SocioRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.SocioResponseDto;
import ar.edu.ucc.arqSoft.baseService.model.Socio;


@Service
@Transactional
public class socioService {

	@Autowired
	private socioDao SocioDao;
	

	public SocioResponseDto registrarSocio (SocioRequestDto dto) {
		
		Socio socio = new Socio();
		
		socio.setNombre(dto.getName());
		socio.setApellido(dto.getApellido());
		socio.setDni(dto.getDni());
		socio.setEmail(dto.getEmail());
		
		SocioDao.insert(socio);
		
		SocioResponseDto response = new SocioResponseDto();
		
		response.setName(socio.getNombre());
		response.setApellido(socio.getApellido());
		response.setDni(socio.getDni());
		
	
		return response;
		
	}
}
