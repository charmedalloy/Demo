package com.car;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Owner {
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    private int ownerid;
    private String name;

    public Owner() {
    }

    public Owner(String name) {
     
        this.name = name;
    }
    
    @OneToMany(mappedBy="Car")
    public int getOwnerid() {
        return ownerid;
    }

    public void setOwnerId(int ownerId) {
        this.ownerid = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
