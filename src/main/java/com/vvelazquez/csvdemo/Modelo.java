package com.vvelazquez.csvdemo;

import com.opencsv.bean.CsvBindByName;

public class Modelo {

	@CsvBindByName
	private Long id;
	
	@CsvBindByName
	private String nombre1;
	
	@CsvBindByName
	private String nombre2;
	
	@CsvBindByName(column = "apellido_paterno")
	private String apellidoPaterno;
	
	@CsvBindByName(column = "apellido_materno")
	private String apellidoMaterno;
	
	public Modelo() {
		super();
	}

	public Modelo(Long id, String nombre1, String nombre2, String apellidoPaterno, String apellidoMaterno) {
		super();
		this.id = id;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	@Override
	public String toString() {
		return "Modelo [id=" + id + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apellidoPaterno="
				+ apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + "]";
	}
	
}
