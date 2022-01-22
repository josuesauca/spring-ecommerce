package com.curso.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DetalleOrden {
	
	private Integer id;
	private String nombre;
	private Double cantidad;
	private Double precio;
	private Double total;

	public DetalleOrden() {
		// TODO Auto-generated constructor stub
	}

	public DetalleOrden(Integer id, String nombre, Double cantidad, Double precio, Double total) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}

	@Override
	public String toString() {
		return "DetalleOrden [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
				+ ", total=" + total + "]";
	}

}

