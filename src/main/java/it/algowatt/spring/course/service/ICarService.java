package it.algowatt.spring.course.service;

import it.algowatt.spring.course.domain.entity.Car;

public interface ICarService {

	public Iterable<Car> selAll();
	
	public void save(Car car);
}
