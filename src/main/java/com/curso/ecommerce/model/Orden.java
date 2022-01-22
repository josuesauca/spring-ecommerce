package com.curso.ecommerce.model;

import java.util.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Orden {
	private Integer id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	private Double total;
	
	public Orden() {
		// TODO Auto-generated constructor stub
	}

	public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecibida, Double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", fechaRecibida="
				+ fechaRecibida + ", total=" + total + "]";
	}

}
