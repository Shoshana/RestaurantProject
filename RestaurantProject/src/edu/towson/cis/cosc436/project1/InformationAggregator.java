//factory pattern
package edu.towson.cis.cosc436.project1;

import edu.towson.cis.cosc436.project1.Order.Order;
import edu.towson.cis.cosc436.project1.foodQueue.FoodQueue;
import edu.towson.cis.cosc436.project1.menu.Menu;


public class InformationAggregator {

	public Menu initializeNewMenu(){
		 Menu menu = new Menu();
		 return menu;
	}
	
	public FoodQueue initializeFoodQueue(){
		return new FoodQueue(); 
	}
	
	public Order initializeNewCustomerOrders(){
		Order custOrders = new Order();
		 return custOrders;
	}
	
	public SpecialOffers initializeNewSpecialOffers(){
		SpecialOffers specialOffers = new SpecialOffers();
		 return specialOffers;
	}
	
	public StaffSchedule initializeNewStaffSchedule(){
		StaffSchedule staffSchedule = new StaffSchedule();
		 return staffSchedule;
	}
	
	public Table initializeNewTable(){
		 Table table = new Table();
		 return table;
	}
	
	public CustomerComments initializeNewCustomerComments(){
		CustomerComments custComments = new CustomerComments();
		 return custComments;
	}
}
