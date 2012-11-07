/*
 * The user interface allows the indiviudal to select there role and began the resturant process. 
 */
package edu.towson.cis.cosc436.project1.userInterface;


import java.util.Scanner;


public class UserInterface {
    
    public static void main(String [] args){
        int choice = 0;
        int select = 0;
        boolean exit = false;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, Please select your role in the resturant?");
        System.out.println("Menu Role");
        System.out.println();
        System.out.println("0. Customer");
        System.out.println("1. Manager");
        System.out.println("2. Cook");
        System.out.println("3. Waitperson");
        System.out.println("4. Staff Member");
        System.out.println("5. Exit");
        choice = input.nextInt();
      
         switch(choice){
            case 0:
            Customer guest = new Customer();
            guest.displayMenu();
            //select = input.nextInt();
            break;
            case 1:
            Manager m = new Manager();
            m.displayMenu();
            //select = input.nextInt();
            break;
            case 2:
            Cook c = new Cook();
            c.displayMenu();
            break;
            case 3:
            Waitperson w = new Waitperson();
            w.displayMenu();
            break;
            case 4:
            StaffMember s = new StaffMember();
            s.displayMenu();
            break;
            case 5:
            exit = true;
            break;
            default:
            System.out.println("Invalid Entry!");
        }
    }
}
