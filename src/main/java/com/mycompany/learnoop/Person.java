/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.learnoop;

import java.util.*;

/**
 *
 * @author ochuk
 */
public class Person {
    public String firstName;
    public String lastName;
    public Calendar birthday;
    
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = new GregorianCalendar();
    }
    
    public Person() {
    firstName = "";
    lastName = "";
    birthday = new GregorianCalendar();
}
    
    public String firstName () {
        return this.firstName;
    }
    
    public String lastName () {
        return today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
    }
}
