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
public class Plane extends Vehicle {
    public boolean isFlying;
    
    public Plane (){
    }
    
    // Check if the car isDriving 
    public void drive() {
        this.isFlying = true;
    }
    
    public void stop() {
        this.isFlying = false;
        this.tripsSinceMaintenance++;
    }
    
    public void repair(){
        this.tripsSinceMaintenance = 0;
        this.needsMaintenance = false;
    }
    public static void main(String[] args) {
        
        // Car 1
        Cars plane = new Cars();
        plane.setModel("Plane model");
        plane.setMake("Plane make");
        plane.setYear(2021);
        plane.setWeight(23.3);
        plane.setNeedsMaintenance(false);
        plane.setTripsSinceMaintenance(0);               
        
        int planeLocation = 0;
        while (planeLocation < 122) {
            if(plane.getTripsSinceMaintenance() < 100) {
                plane.drive();
                plane.stop();
                  System.out.println("Flying" + plane.getTripsSinceMaintenance());
            } else {
                plane.setNeedsMaintenance(true); 
                System.out.println("The plain can't fly untill it's repaired"); 
                break;
            }
            
            planeLocation++;
                                
        }
        
        System.out.println("Model: " + plane.getModel());
        System.out.println("Make: " + plane.getMake());
        System.out.println("Yead: " + plane.getYear());
        System.out.println("Weight: " + plane.getWeight());
        System.out.println("NeedMaintenance: " + plane.getNeedMaintenance());
        System.out.println("TripsSinceMaintenance: " + plane.getTripsSinceMaintenance());
        System.out.println("");
    }
}
