package com.truck.autolider.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="detallecontratos")
public class DetalleContrato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Integer idDetalle;
	private String descripcion;
	private String marca;
	private String modelo;
	private Integer kilometraje;
	private double cantidad;
	private double precio;
	private double total;
	
	//Relación
	@OneToOne
	private Contrato contrato;
	
	@ManyToOne
	private Vehiculos vehiculos;
	
	public Integer getIdDetalle() {
		return idDetalle;
	}
	public void setIdDetalle(Integer idDetalle) {
		this.idDetalle = idDetalle;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(Integer kilometraje) {
		this.kilometraje = kilometraje;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public Contrato getContrato() {
		return contrato;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	public Vehiculos getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(Vehiculos vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	
	@Override
	public String toString() {
		return "DetalleContrato [idDetalle=" + idDetalle + ", descripcion=" + descripcion + ", marca=" + marca
				+ ", modelo=" + modelo + ", kilometraje=" + kilometraje + ", cantidad=" + cantidad + ", precio="
				+ precio + ", total=" + total + ", contrato=" + contrato + ", vehiculos=" + vehiculos + "]";
	}
	
	
	
	
}
