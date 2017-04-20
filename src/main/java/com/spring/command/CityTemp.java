package com.spring.command;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_CITY_TEMP")
public class CityTemp {

	@Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
     
	@Column(name="NAME")
	private String name;
	
	@Column(name="TEMP")
	private String temp;

	
	
	

	public CityTemp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CityTemp(String name, String temp) {
		super();
		this.name = name;
		this.temp = temp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "CityTemp [id=" + id + ", name=" + name + ", temp=" + temp + "]";
	}
	
	
	
}
