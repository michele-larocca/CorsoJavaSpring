package it.algowatt.spring.course.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.algowatt.spring.course.domain.entity.Car;
import it.algowatt.spring.course.service.ICarService;

@RestController
@RequestMapping("/api/store")
public class StoreWebController {

	@Autowired 
	private ICarService carService;
	
	@GetMapping("/isAlive")
	public String isAlive() {
		return "Ciao sono le ore " + new Date().toString();
	}
	
	@GetMapping("/allCars")
	public Iterable<Car> getAllCars(){
		return carService.selAll();
	}
	
	@GetMapping("/saveCar")
	public String saveCar(@RequestParam String brand, @RequestParam String model){
		try{
			Car car = new Car();
			car.setBrand(brand);
			car.setModel(model);
			
			carService.save(car);
			return "Salvataggio andato a buon fine!!!";
			
		}catch (Exception e) {
			return "Errore durante il salvataggio: " + e.getMessage();
		}
		
	}
}
