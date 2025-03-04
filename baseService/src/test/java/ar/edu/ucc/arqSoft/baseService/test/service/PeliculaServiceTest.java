package ar.edu.ucc.arqSoft.baseService.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ucc.arqSoft.baseService.dto.PeliculasResponseDto;
import ar.edu.ucc.arqSoft.baseService.service.peliculasService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })

public class PeliculaServiceTest {

	@Autowired
	private peliculasService PeliculaService;
	
	@Test
	public void testFindById() {
		PeliculasResponseDto response = PeliculaService.getPeliculaById((long) 2);
		
		Assert.assertEquals("titanic", response.getTitulo());
		return;
	}
	
	
}
