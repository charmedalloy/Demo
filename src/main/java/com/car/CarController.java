package com.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService service;

//    @RequestMapping("/")
//    public String home() {
//        return "ok!!";
//    }

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
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
    public List<Object> getAllOwners(@PathVariable String id) {
        return service.getAllOwners(id);
    }
}
