package ar.edu.ucc.arqsoft.WebService.test.dao;

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

import ar.edu.ucc.arqsoft.WebService.dao.socioDao;
import ar.edu.ucc.arqsoft.WebService.model.Socio;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
@Transactional
public class SocioDaoTest {
	
private static final Logger logger = LogManager.getLogger(SocioDaoTest.class);
	
	@Autowired
	private socioDao SocioDao;

	@Test
	public void testFindById() {
		logger.info("Test de busqueda de State por ID");
		Socio socio = SocioDao.load((long) 2);
		
		Assert.assertEquals("Raul", socio.getNombre());
		return;
	}

	@Test
	public void testRegister() {

		logger.info("Test de Registro de State");
		State state = new State();
		state.setName("Buenos Aires");

		stateDao.insert(state);
		Assert.assertEquals(3, state.getId().longValue());
		return;
	}

	@Test
	public void testUpdate() {

		logger.info("Test de actualización de State");
		State state = stateDao.load((long) 1);
		state.setName("Salta Nuevo");
		stateDao.update(state);

		State state1 = stateDao.load((long) 1);
		Assert.assertEquals("Salta Nuevo", state1.getName());
		return;
	}
	
	@Test
	public void testfindByName() {

		logger.info("Test de busqueda de State por Nombre");
		List<State> states= stateDao.findByName("Córdoba");
		Assert.assertEquals(1, states.size());
		return;
	}
	
	@Test
	public void testGetAll() {

		logger.info("Test de busqueda de todos los States");
		List<State> states= stateDao.getAll();
		Assert.assertNotNull(states);
		return;
	}

}
