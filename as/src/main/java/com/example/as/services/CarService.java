package com.example.as.services;

import com.example.as.models.Car;
import com.example.as.models.Customer;
import com.example.as.repositories.CarRepository;
import com.example.as.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    final
    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public void delete(Long id) {
        carRepository.deleteById(id);
    }
}
