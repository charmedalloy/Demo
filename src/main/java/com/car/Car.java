package com.car;

import javax.persistence.*;
import javax.swing.text.html.Option;

//changes --aval
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String make;
    private String model;
    private String year;
    private String color;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ownerId", referencedColumnName = "ownerId")
    private Owner owner;

    public Car(String make, String model, String year, String color, Owner owner) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.owner = owner;
    }

    public Car() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
