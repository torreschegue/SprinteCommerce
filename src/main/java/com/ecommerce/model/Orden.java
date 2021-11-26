package com.ecommerce.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordenes")
public class Orden {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String numero;
	private Date fechaCreacion;
	private Date FechaRecibido;
	private double total;
	
	@ManyToOne
	private Usuario usuario;
	
	// Relacion Orden - DetalleOrden
	@OneToOne(mappedBy = "orden")
	private DetalleOrden detalle;
	
	
	public Orden() {
		
	}

	public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecibido, double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		FechaRecibido = fechaRecibido;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaRecibido() {
		return FechaRecibido;
	}

	public void setFechaRecibido(Date fechaRecibido) {
		FechaRecibido = fechaRecibido;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

	public DetalleOrden getDetalle() {
		return detalle;
	}

	public void setDetalle(DetalleOrden detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", FechaRecibido="
				+ FechaRecibido + ", total=" + total + "]";
	}


}
