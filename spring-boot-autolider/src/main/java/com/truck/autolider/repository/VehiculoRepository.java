package com.truck.autolider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.truck.autolider.model.Vehiculos;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculos, Integer>{

}
