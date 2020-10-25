package ar.edu.ucc.arqSoft.baseService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.ucc.arqSoft.baseService.dto.SocioRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.SocioResponseDto;
import ar.edu.ucc.arqSoft.baseService.service.socioService;


@Controller
@RequestMapping("/socio")
public class socioController {
	
	@Autowired
	private socioService SocioService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody SocioResponseDto registrar(@RequestBody SocioRequestDto request) {
		return SocioService.registrarSocio(request);
	}
}
