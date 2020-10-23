package ar.edu.ucc.arqsoft.WebService.dto;

import org.modelmapper.ModelMapper;
import org.springframework.ui.ModelMap;


public class ModelDtoConverter {
	
	public DtoEntity convertToDto(Object obj, DtoEntity mapper) {
		return new ModelMap().map(obj, mapper.getClass());
	}

	public Object convertToEntity(Object obj, DtoEntity mapper) {
		return new ModelMapper().map(mapper, obj.getClass());
	}

}
