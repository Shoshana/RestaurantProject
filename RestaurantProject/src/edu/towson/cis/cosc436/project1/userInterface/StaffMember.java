/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cis.cosc436.project1.userInterface;

/**
 *
 * @author Amanda
 */
public class StaffMember {
    String fname;
    String lname;
    
    public StaffMember(String firstName, String lastName){
        fname = firstName;
        lname = lastName;    
    }
    
    public StaffMember(){
        fname = "Default";
        lname = "User";
        
    }
    
    public void callWaitPerson(){
        System.out.println("Waitperson notified.");
    }
    
    private void accessLoginSheet(String user, String password){
        
    }
    //Employees can request off and note any scheduling changes
    public void setTimeSheet(){
        System.out.println("Confirmed, scheduling changes need manager confirmation");
    }
    //I wasn't sure whether we will be implementing the Timesheet or not
    public void getTimeSheet(String timeSheet){
        
    }
    
    public void displayMenu(){
        System.out.println("Staff Member Menu ");
        System.out.println("1.View and Edit Timesheet\n2.Timesheet Login\n3.Notify Waitstaff");
    }
}
