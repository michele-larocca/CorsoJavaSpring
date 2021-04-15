package it.algowatt.spring.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.algowatt.spring.course.domain.entity.Car;
import it.algowatt.spring.course.domain.repo.CarRepository;

@Service
public class CarService implements ICarService {

	private @Autowired CarRepository carRepo;
	
	@Override
	public Iterable<Car> selAll() {
		return carRepo.findAll();
	}

	@Override
	public void save(Car car) {
		carRepo.save(car);
	}

}
