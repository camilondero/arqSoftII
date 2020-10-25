package ar.edu.ucc.arqSoft.baseService.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ucc.arqSoft.baseService.dto.SocioRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.SocioResponseDto;
import ar.edu.ucc.arqSoft.baseService.service.socioService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
public class SocioServiceTest {
	
	@Autowired
	private socioService SocioService;
	
	@Test
	public void testInsert() {
		SocioRequestDto request = new SocioRequestDto();
		request.setName("Alejandro");
		
		SocioResponseDto response = SocioService.registrarSocio(request);
		
		Assert.assertEquals("Alejandro",response.getName());
		return;
	}

}
