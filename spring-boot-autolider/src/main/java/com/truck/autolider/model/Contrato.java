package com.truck.autolider.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="contratos")
public class Contrato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer idContrato;
	private Date fechaCompra;
	private Date fechaEntrega;
	private double valor;
	
	//Relación
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne(mappedBy = "contrato")
	
	private DetalleContrato detallecontrato;
	
	public Integer getIdContrato() {
		return idContrato;
	}
	public void setIdContrato(Integer idContrato) {
		this.idContrato = idContrato;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	
	public DetalleContrato getDetallecontrato() {
		return detallecontrato;
	}
	public void setDetallecontrato(DetalleContrato detallecontrato) {
		this.detallecontrato = detallecontrato;
	}
	@Override
	public String toString() {
		return "Contrato [idContrato=" + idContrato + ", fechaCompra=" + fechaCompra + ", fechaEntrega=" + fechaEntrega
				+ ", valor=" + valor + ", usuario=" + usuario + ", detallecontrato=" + detallecontrato + "]";
	}
	
	

	
}
