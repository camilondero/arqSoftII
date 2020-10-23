package ar.edu.ucc.arqsoft.WebService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.ucc.arqsoft.WebService.dto.PeliculasRequestDto;
import ar.edu.ucc.arqsoft.WebService.dto.PeliculasResponseDto;
import ar.edu.ucc.arqsoft.WebService.service.peliculasService;


@Controller
@RequestMapping("/pelicula")
public class peliculasController {
	
	@Autowired
    private peliculasService PeliculasService;

    @RequestMapping(method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<PeliculasResponseDto> getAllStates()
    {
        return PeliculasService.getAllStates();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PeliculasResponseDto lookupStateById(@PathVariable("id") Long id)
    {
        return PeliculasService.getStateById(id);
    }
    
    @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PeliculasResponseDto savePelicula(@RequestBody PeliculasRequestDto request)
    {
        return PeliculasService.insertPeliculas(request);
    }

}
