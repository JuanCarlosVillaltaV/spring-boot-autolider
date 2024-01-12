package com.truck.autolider.controller;

import java.util.Optional;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.truck.autolider.model.Usuario;
import com.truck.autolider.model.Vehiculos;
import com.truck.autolider.service.VehiculoService;

@Controller
@RequestMapping("/vehiculos")

public class VehiculoController {

	private final Logger LOGGER = LoggerFactory.getLogger(VehiculoController.class);
	
	@Autowired
	private VehiculoService vehiculoService;
	
	@GetMapping("")
	public String show(Model model) {
	model.addAttribute("vehiculos",vehiculoService.findAll());
		return "vehiculos/show";
		}
	
	@GetMapping("/create")
	public String create() {
		
		return "vehiculos/create";
	}
	
	
	
	
		@PostMapping("/save")
		public String save(Vehiculos vehiculos) {
			LOGGER.info("Este es el objeto vehiculo{}",vehiculos);
			
			Usuario u = new Usuario(1,"","","","", null, null, null, null, null);
			vehiculos.setUsuario(u);
			vehiculoService.save(vehiculos);
			return "redirect:/vehiculos";
		}
		
		@GetMapping("/edit/{idVehiculo}")
		public String edit(@PathVariable 
				           Integer idVehiculo,
				           Model model) 
		{
			Vehiculos vehiculos= new Vehiculos();
			Optional<Vehiculos> optionalVehiculos=vehiculoService.get(idVehiculo);
			vehiculos=optionalVehiculos.get();
			LOGGER.info("Vehiculo buscando:{}",vehiculos);
			
			model.addAttribute("vehiculos", vehiculos);
			return "vehiculos/edit";
			
		}
		
		@PostMapping("/update")
		private String update(Vehiculos vehiculos) {
			vehiculoService.update(vehiculos);
			return "redirect:/vehiculos";
			

		} 
		
		@GetMapping("/delete/{idVehiculo}")
		public String delete(@PathVariable Integer idVehiculo) {
			vehiculoService.delete(idVehiculo);
			return "redirect:/vehiculos";
			
		}
		
		
		
	}
	
	
	



























	
	

	

