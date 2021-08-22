package com.prueba.adn.dto;

public class AdnDto {
	
    private long id;
    private String baseAdn1;
    private String baseAdn2;
    private String baseAdn3;
    private String baseAdn4;
    private String baseAdn5;
    private String baseAdn6;
	
	public AdnDto() {
	}
	
	
	
	public AdnDto(long id, String baseAdn1, String baseAdn2, String baseAdn3, String baseAdn4, String baseAdn5,
			String baseAdn6) {
		super();
		this.id = id;
		this.baseAdn1 = baseAdn1;
		this.baseAdn2 = baseAdn2;
		this.baseAdn3 = baseAdn3;
		this.baseAdn4 = baseAdn4;
		this.baseAdn5 = baseAdn5;
		this.baseAdn6 = baseAdn6;
	}



	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getBaseAdn1() {
		return baseAdn1;
	}
	
	public void setBaseAdn1(String baseAdn1) {
		this.baseAdn1 = baseAdn1;
	}
	
	public String getBaseAdn2() {
		return baseAdn2;
	}
	
	public void setBaseAdn2(String baseAdn2) {
		this.baseAdn2 = baseAdn2;
	}
	
	public String getBaseAdn3() {
		return baseAdn3;
	}
	
	public void setBaseAdn3(String baseAdn3) {
		this.baseAdn3 = baseAdn3;
	}
	
	public String getBaseAdn4() {
		return baseAdn4;
	}
	
	public void setBaseAdn4(String baseAdn4) {
		this.baseAdn4 = baseAdn4;
	}
	
	public String getBaseAdn5() {
		return baseAdn5;
	}
	
	public void setBaseAdn5(String baseAdn5) {
		this.baseAdn5 = baseAdn5;
	}
	
	public String getBaseAdn6() {
		return baseAdn6;
	}
	
	public void setBaseAdn6(String baseAdn6) {
		this.baseAdn6 = baseAdn6;
	}
	
}
