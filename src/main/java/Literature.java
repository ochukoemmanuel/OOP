/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ochuk
 */
public class Literature {
    
    private String title;
    private String author;
    
    public Literature (String title, String author){
        this.title = title;
        this.author = author;
    }
    
    public void Print()
    {
        System.out.println(title);
        System.out.println("\tWritten By: " + author);
    }
}
