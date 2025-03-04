package ar.edu.ucc.arqSoft.baseService.test.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.baseService.dao.peliculaDao;
import ar.edu.ucc.arqSoft.baseService.model.Pelicula;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
@Transactional

public class PeliculaDaoTest {
	
	private static final Logger logger = LogManager.getLogger(PeliculaDaoTest.class);
	
	@Autowired
	private peliculaDao PeliculaDao;
	
	@Test
	public void testFindById() {
		logger.info("Test de busqueda de pelicula por ID");
		Pelicula pelicula = PeliculaDao.load((long) 2);
		
		Assert.assertEquals("titanic", pelicula.getTitulo());
		return;
	}
	
	@Test
	public void testGetAll() {

		logger.info("Test de busqueda de todas las peliculas");
		List<Pelicula> peliculas= PeliculaDao.getAll();
		Assert.assertNotNull(peliculas);
		return;
	}

}
