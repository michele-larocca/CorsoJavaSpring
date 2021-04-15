package it.algowatt.spring.course.domain.repo;

import org.springframework.data.repository.CrudRepository;

import it.algowatt.spring.course.domain.entity.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {

}
