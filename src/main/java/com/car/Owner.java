package com.car;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ownerid;
    private String name;

    public Owner() {
    }

    public Owner(String name) {
        this.name = name;
    }

    public int getOwnerid() {
        return ownerid;
    }

    public void setOwnerId(int ownerId) {
        this.ownerid = ownerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
