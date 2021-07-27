/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.advancedoop;

/**
 *
 * @author ochuk
 */
public class Vehicle {
    public String make;
    public String model;
    public int year;
    public double weight;
    public boolean needsMaintenance;
    public int tripsSinceMaintenance;
    
    // set default values
    public Vehicle (){
        make = "This is the default make of the car";
        model = "This is the default model of the car";
        year = 0;
        weight = 0;
        needsMaintenance = false;
        tripsSinceMaintenance = 0;
    }
    
    public Vehicle (String make, String model, int year, double weight, boolean needsMaintenance, int tripsSinceMaintenance) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.weight = weight;
        this.needsMaintenance = needsMaintenance;
        this.tripsSinceMaintenance = tripsSinceMaintenance;
    }
    
    // Get method
    public String getMake() {
        return this.make;
    }   
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getModel() {
        return this.model;
    }   
    
    public void setModel(String model){
        this.model = model;
    }
    
    public int getYear () {
        return this.year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public boolean getNeedMaintenance() {
        return this.needsMaintenance;
    }
    
    public void setNeedsMaintenance(boolean needsMaintenance) {
        this.needsMaintenance = needsMaintenance;
    }
    
    public int getTripsSinceMaintenance() {
        return this.tripsSinceMaintenance;
    }
    
    public void setTripsSinceMaintenance(int tripsSinceMaintenance) {
        this.tripsSinceMaintenance = tripsSinceMaintenance;
    }
 
}
