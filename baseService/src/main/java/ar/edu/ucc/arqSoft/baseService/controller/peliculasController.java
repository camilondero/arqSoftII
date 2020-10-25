package ar.edu.ucc.arqSoft.baseService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.ucc.arqSoft.baseService.dto.PeliculasResponseDto;
import ar.edu.ucc.arqSoft.baseService.service.peliculasService;



@Controller
@RequestMapping("/pelicula")
public class peliculasController {
	
	@Autowired
    private peliculasService PeliculasService;

    @RequestMapping(method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<PeliculasResponseDto> getAllPeliculas()
    {
        return PeliculasService.getAllPeliculas();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PeliculasResponseDto lookupPeliculaById(@PathVariable("id") Long id)
    {
        return PeliculasService.getPeliculaById(id);
    }
    
   

}
