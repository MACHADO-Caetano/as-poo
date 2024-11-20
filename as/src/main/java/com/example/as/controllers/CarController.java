package com.example.as.controllers;

import com.example.as.models.Car;
import com.example.as.models.Customer;
import com.example.as.repositories.CarRepository;
import com.example.as.services.CarService;
import com.example.as.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    List<Car> listAllCars(){
        return carService.findAll();
    }

    @PostMapping
    Car saveCars(@RequestBody Car car) {
        return carService.save(car);
    }

    @PutMapping
    Car updateCars(@RequestBody Car car) {
        return carService.save(car);
    }

    @DeleteMapping
    public void deleteCar(Long id) {
        carService.delete(id);
    }
}
