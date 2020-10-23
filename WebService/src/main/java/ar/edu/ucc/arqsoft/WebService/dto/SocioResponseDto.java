package ar.edu.ucc.arqsoft.WebService.dto;


public class SocioResponseDto implements DtoEntity{

private String name;
	
	private Long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
