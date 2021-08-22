package com.prueba.adn.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
public class ADN {
	
	@Id
    private long id;
	@NotNull
	@Size(min = 1, max = 1)
	private String baseAdn1;
	@NotNull
	@Size(min = 1, max = 1)
	private String baseAdn2;
	@NotNull
	@Size(min = 1, max = 1)
	private String baseAdn3;
	@NotNull
	@Size(min = 1, max = 1)
	private String baseAdn4;
	@NotNull
	@Size(min = 1, max = 1)
	private String baseAdn5;
	@NotNull
	@Size(min = 1, max = 1)
	private String baseAdn6;
	
	public ADN() {
	}
	
	
	
	public ADN(long id, @Size(min = 1, max = 1) String baseAdn1, @Size(min = 1, max = 1) String baseAdn2,
			@Size(min = 1, max = 1) String baseAdn3, @Size(min = 1, max = 1) String baseAdn4,
			@Size(min = 1, max = 1) String baseAdn5, @Size(min = 1, max = 1) String baseAdn6) {
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
