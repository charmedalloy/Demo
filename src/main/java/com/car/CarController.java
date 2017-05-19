package com.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService service;

    @RequestMapping("/")
    public String home() {
        return "ok!!";
    }

    @RequestMapping("/cars")
    public List<Car> getAllCars() {
        return service.getAllCars();
    }

    @PostMapping("/car")
    public void addCar(@RequestBody Car car) {
        service.addCar(car);
    }

    @RequestMapping("/find")
    public List<Car> findSpecific(@RequestParam String make, @RequestParam String year) {
        return service.find(make, year);
    }

    @GetMapping("/owners/{id}/cars")
    public List<Car> getAllOwners(@PathVariable String id ) {
        return service.getAllOwners(id);
    }
}
