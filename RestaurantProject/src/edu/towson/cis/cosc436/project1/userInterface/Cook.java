/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cis.cosc436.project1.userInterface;

/**
 *
 * @author Amanda
 */
public class Cook extends StaffMember {
    int numOrders;
    
      public Cook(String firstName, String lastName, int nOrders){
       super(firstName,lastName);
       numOrders = nOrders;
   }
   public Cook(){
       super("Default","Cook");
       numOrders =0;
   }
   public void manageFoodQueue(){
    System.out.println("");
}
   public void viewFoodQueue(){
       System.out.println("View Food Queue");
   }
   public void noDish(){
       System.out.println("Dish is not available");
   }
   
   public void notifyWaitperson(){
       System.out.println("Waitperson notified");
   }
   
   public void displayMenu(){
        System.out.println("Cook Menu ");
        System.out.println("1.Manage Food Queue\n2.Unavailable Dishes\n3.View Food and Order Queue\n4.Notify Waitperson");
   }
}
