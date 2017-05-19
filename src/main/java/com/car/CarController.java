package com.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;
    
   /* @Autowired
    private OwnerService ownerService;*/

    @RequestMapping("/")
    public String home() {
        return "ok!!";
    }

    @RequestMapping("/Cars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @PostMapping("/Car")
    public void addCar(@RequestBody Car car) {
        carService.addCar(car);
    }

    @RequestMapping("/find")
    public List<Car> findSpecific(@RequestParam String make, @RequestParam String year) {
        return carService.find(make, year);
    }
    
    @RequestMapping("/findByOwner")
    public List<Car> findCar(@RequestParam int id) {
        return carService.findCarByOwner(id);
    }
    
    @GetMapping("jpqlCars/{id}")
	public List<Car> getArticleById(@PathVariable("id") Integer id) {
		List<Car> cars = carService.findCarByOwn(id);
		return cars;
	}
}
