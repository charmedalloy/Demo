package com.car;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, String> {

    @Query(nativeQuery = true, value = "SELECT c.make,c.year,o.name FROM Car c,Owner o WHERE c.ownerId = o.OwnerId AND c.ownerId =?0")
    public List<Car> getCars(String id);
}
