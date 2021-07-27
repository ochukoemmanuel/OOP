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
public class Cars extends Vehicle {
    private boolean isDriving;
    
    public Cars (){
    }
    
    // Check if the car isDriving 
    public void drive() {
        this.isDriving = true;
    }
    
    public void stop() {
        this.isDriving = false;
        this.tripsSinceMaintenance++;
    }
    
    public void repair(){
        this.tripsSinceMaintenance = 0;
        this.needsMaintenance = false;
    }
    
    public static void main(String[] args) {
        
        // Car 1
        Cars bmw = new Cars();
        bmw.setModel("A‑Class");
        bmw.setMake("Mercedes‑Benz");
        bmw.setYear(2021);
        bmw.setWeight(10.3);
        bmw.setNeedsMaintenance(false);
        bmw.setTripsSinceMaintenance(0);               
        
        int bmwLocation = 0;
        while (bmwLocation < 11) {
                                bmw.drive();
                                bmw.stop();
                                bmwLocation++;
                                    if(bmwLocation == 100) bmw.setNeedsMaintenance(true);
                            }
        
        System.out.println("Model: " + bmw.getModel());
        System.out.println("Make: " + bmw.getMake());
        System.out.println("Yead: " + bmw.getYear());
        System.out.println("Weight: " + bmw.getWeight());
        System.out.println("NeedMaintenance: " + bmw.getNeedMaintenance());
        System.out.println("TripsSinceMaintenance: " + bmw.getTripsSinceMaintenance());
        System.out.println("");
        
        // Car 2
        Cars mercedesBenz = new Cars();
        mercedesBenz.setModel("Benz");
        mercedesBenz.setMake("Mercedes");
        mercedesBenz.setWeight(9.7);
        mercedesBenz.setYear(2019);
        mercedesBenz.setNeedsMaintenance(false);
        mercedesBenz.setTripsSinceMaintenance(0);
        
        int benzLocation = 0; 
        while(benzLocation < 100){
        mercedesBenz.drive();
        mercedesBenz.stop();
        benzLocation++;
                if (benzLocation == 100) mercedesBenz.setNeedsMaintenance(true);
        }
        // Repair
        mercedesBenz.repair();
        
        System.out.println("Model: " + mercedesBenz.getModel());
        System.out.println("Make: " + mercedesBenz.getMake());
        System.out.println("Yead: " + mercedesBenz.getYear());
        System.out.println("Weight: " + mercedesBenz.getWeight());
        System.out.println("NeedMaintenance: " + mercedesBenz.getNeedMaintenance());
        System.out.println("TripsSinceMaintenance: " + mercedesBenz.getTripsSinceMaintenance());
        System.out.println("");
        
        
        // Car 3
        Cars lamborghini = new Cars();
        lamborghini.setModel("aventador-svj");
        lamborghini.setYear(2011);
        lamborghini.setWeight(8.9);
        lamborghini.setNeedsMaintenance(false);
        lamborghini.setTripsSinceMaintenance(0);
        
        int lamLocation = 0; 
        while(lamLocation < 100){
        lamborghini.drive();
        lamborghini.stop();
        lamLocation++;
            if(lamLocation == 100) lamborghini.setNeedsMaintenance(true);
        }
        
        System.out.println("Model: " + lamborghini.getModel());
        System.out.println("Make: " + lamborghini.getMake());
        System.out.println("Yead: " + lamborghini.getYear());
        System.out.println("Weight: " + lamborghini.getWeight());
        System.out.println("NeedMaintenance: " + lamborghini.getNeedMaintenance());
        System.out.println("TripsSinceMaintenance: " + lamborghini.getTripsSinceMaintenance());
            
        }
        
       
    }