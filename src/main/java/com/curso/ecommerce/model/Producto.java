package com.curso.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Producto {
	private Integer id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private Double precio;
	private Integer cantidad;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(Integer id, String nombre, String descripcion, String imagen, Double precio, Integer cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	

}
