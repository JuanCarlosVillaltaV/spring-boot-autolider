package com.truck.autolider.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.truck.autolider.model.Vehiculos;

@Service
public interface VehiculoService {

	public Vehiculos save(Vehiculos vehiculos);
	public Optional<Vehiculos> get(Integer idVehiculo);
	public void update(Vehiculos vehiculos);
	public void delete(Integer idVehiculo);
	public List<Vehiculos> findAll();
}
