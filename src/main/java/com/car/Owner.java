package com.car;

import javax.persistence.*;

@Entity
public class Owner {
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    private int ownerId;
    private String name;

    public Owner() {
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner(String name) {

        this.name = name;
    }

}
