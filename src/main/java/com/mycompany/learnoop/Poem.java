/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.learnoop;

/**
 *
 * @author ochuk
 */
public class Poem extends Literature {
    private String style;
    
     public Poem (String title, String author, String style) {
        super(title, author);
        this.style = style;
    }
    
    @Override
     public void Print()
    {
        super.Print();
        System.out.println("\tIn The Style of: " + style);
    }
}
