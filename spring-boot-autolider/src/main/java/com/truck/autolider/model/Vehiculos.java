package com.truck.autolider.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="vehiculos")
public class Vehiculos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
 private Integer idVehiculo;
 private String marca;
 private String modelo;
 private String año;
 private int kilometraje;
 private String potenciaHp;
 private String imagen;
 private double precio;
 private int cantidad;
//Relaciones JPA
 @ManyToOne
 private Usuario usuario;
 
 
public Integer getIdVehiculo() {
	return idVehiculo;
}
public void setIdVehiculo(Integer idVehiculo) {
	this.idVehiculo = idVehiculo;
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
public String getAño() {
	return año;
}
public void setAño(String año) {
	this.año = año;
}
public int getKilometraje() {
	return kilometraje;
}
public void setKilometraje(int kilometraje) {
	this.kilometraje = kilometraje;
}
public String getPotenciaHp() {
	return potenciaHp;
}
public void setPotenciaHp(String potenciaHp) {
	this.potenciaHp = potenciaHp;
}
public String getImagen() {
	return imagen;
}
public void setImagen(String imagen) {
	this.imagen = imagen;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}	



public Usuario getUsuario() {
	return usuario;
}
public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}
@Override
public String toString() {
	return "Vehiculos [idVehiculo=" + idVehiculo + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año
			+ ", kilometraje=" + kilometraje + ", potenciaHp=" + potenciaHp + ", imagen=" + imagen + ", precio="
			+ precio + ", cantidad=" + cantidad + ", usuario=" + usuario + "]";
}




 
}
