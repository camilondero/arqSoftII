package ar.edu.ucc.arqSoft.baseService.test.dao;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.baseService.dao.socioDao;
import ar.edu.ucc.arqSoft.baseService.model.Socio;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
@Transactional
public class SocioDaoTest {
	
private static final Logger logger = LogManager.getLogger(SocioDaoTest.class);
	
	@Autowired
	private socioDao SocioDao;


	@Test
	public void testRegister() {

		logger.info("Test de Registro de State");
		Socio socio = new Socio();
		socio.setNombre("Alejandro");
		socio.setApellido("Gomez");
		socio.setDni("42441672");
		socio.setEmail("ale@gmail.com");
		SocioDao.insert(socio);
	
		Assert.assertEquals(3, socio.getId().longValue());
		return;
	}


}
