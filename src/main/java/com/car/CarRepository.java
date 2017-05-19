package com.car;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public interface CarRepository extends CrudRepository<Car,String> {

	
    public List<Car> findByMakeInAndYearIn(String make, String year);
    

    @Query(nativeQuery=true, value="SELECT * FROM Car c where c.id < 5")
    public List<Car> findCar();
    
    @Query("select c.make as make, c.model as model "
			+ "from Car c where c.owner.ownerid = ? group by c.make,c.model")
	List<Car> findByOwnerId(int ownerId);

	public List<Car> findCarNew();
    
    
}
