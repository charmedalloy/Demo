package com.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepo;

    @PersistenceContext	
	private EntityManager entityM;
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
    
    public List<Car> findCarByOwner(int ownerId) {

        return carRepo.findByOwnerId(ownerId);
    }
    
    public List<Car> findCarByOwn(int ownerId) {
		String hql = "FROM Car as car WHERE car.owner.ownerid = ?";
		//int count = entityM.createQuery(hql).setParameter(1, ownerId);
		return entityM.createQuery(hql).setParameter(1, ownerId).getResultList();
		}
}
