/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.learnoop;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author ochuk
 */
public class main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Person john = new Person();
        john.firstName = "John";
        john.lastName = "Doe";
        john.birthday = new GregorianCalendar(1988, 1, 5);
        
        
        Person jane = new Person();
        System.out.println(john.firstName + john.lastName);
    }
}
