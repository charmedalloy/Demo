package com.car;

import javax.persistence.*;
//deleting-usingStashed
@Entity
public class Car {
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String make;
    private String model;
    private String year;
    private String color;

    @ManyToOne
    private Owner owner;

    public Car(int id, String make, String model, String year, String color){
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Car(){}

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
