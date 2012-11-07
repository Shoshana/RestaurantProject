/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cis.cosc436.project1.userInterface;

/**
 *
 * @author Amanda
 */
public class Customer {
    String lastName;
    int numParty;
    
    public Customer(String lName,int numOfParty){
        lastName = lName;
        numParty = numOfParty;      
    }
    
     public Customer(){
        lastName = "Guest";
        numParty = 0;      
    }
    
    public void getSeated(){
       
    }
    
    public void placeOrder(){
        
    }
    public void submitComment(){
        
    }
    public void payOrder(){
        
    }
    public void requestStaff(){
        
    }
    
    public void displayMenu(){
        System.out.println("Customer Menu");
        System.out.println("1.Get Seated\n2.Place Order\n3.Check Status\n4.Submit Ratings and Comments\n5.Pay Order");
    }
}
