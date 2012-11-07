/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cis.cosc436.project1.userInterface;

/**
 *
 * @author Amanda
 */
public class Waitperson extends StaffMember{ 
    
    public Waitperson(String firstName, String lastName){
        super(firstName,lastName);
    }
    public Waitperson(){
        super("default","waitperson");
    }
    public void getFood(){
        
    }
    public void respondToCustomer(){
        
    }
    
    public void displayMenu(){
        System.out.println("Waitperson Menu\nPlease select an option. ");
        System.out.println("1.Food Pickup\n2.Respond");
   }
    
    
    
}
