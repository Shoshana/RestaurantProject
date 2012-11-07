/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cis.cosc436.project1.userInterface;

/**
 *
 * @author Amanda
 */
public class Manager extends StaffMember{
    
    public Manager(String firstName, String lastName){
        super(firstName, lastName);
    }
    
    public Manager(){
        super("Default", "User");
    }
    
    public void displayMenu(){
        System.out.println("Manager Menu");
        System.out.println("1.Manage Menu\n2.View Table and View Customer Queue\n3.Staff Schedule");
    }
    
    public void getMenu(){
       
    }
    
    public void viewTableCustomerQueue(){
        
    }
    public void assignStaffSch(){
        
    }
}


