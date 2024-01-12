package com.truck.autolider.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truck.autolider.model.Vehiculos;
import com.truck.autolider.repository.VehiculoRepository;
@Service
public class VehiculoServiceImpl implements VehiculoService {

	@Autowired
	private VehiculoRepository vehiculoRepository;
	
	@Override
	public Vehiculos save(Vehiculos vehiculos) {
		// TODO Auto-generated method stub
		return vehiculoRepository.save(vehiculos);
	}

	@Override
	public Optional<Vehiculos> get(Integer idVehiculo) {
		// TODO Auto-generated method stub
		return vehiculoRepository.findById(idVehiculo);
	}

	@Override
	public void update(Vehiculos vehiculos) {
		// TODO Auto-generated method stub
		vehiculoRepository.save(vehiculos);
		
	}

	@Override
	public void delete(Integer idVehiculo) {
		// TODO Auto-generated method stub
		vehiculoRepository.deleteById(idVehiculo);
	}

	@Override
	public List<Vehiculos> findAll() {
		// TODO Auto-generated method stub
		return vehiculoRepository.findAll();
	}

}
