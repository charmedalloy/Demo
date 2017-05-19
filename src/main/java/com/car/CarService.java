package com.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepo;
    @Autowired
    private OwnerRepository ownerRepo;

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        carRepo.findAll().forEach(cars::add);
        return cars;
    }

    public void addCar(Car car) {
        carRepo.save(car);
    }

    public List<Car> find(String make, String year) {
//        return carRepo.findByMakeInAndYearIn(make, year);
        return carRepo.findCar();
    }

    public List<Object> getAllOwners(String id) {
        List<Object> cars = new ArrayList<>();
        ownerRepo.getCars(id).forEach(cars::add);
        return cars;
    }
}

