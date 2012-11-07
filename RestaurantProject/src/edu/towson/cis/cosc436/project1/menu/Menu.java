package edu.towson.cis.cosc436.project1.menu;

import java.util.LinkedList;

public class Menu{
	private LinkedList<MenuItem> menu = new LinkedList<MenuItem>();
	
	public Menu(){
		MenuItem item1 = new MenuItem("Pasta", "Just some plain pasta cause we're not too fancey", 100, true, 5.00);
		MenuItem item2 = new MenuItem("Vegatables", "Seasonal steamed vegetables", 70,	true, 2.00);
		MenuItem item3 = new MenuItem("Apple Pie a la Mode", "Delicious apple pie and ice cream", 300, false, 5.00);
		MenuItem item4 = new MenuItem("Soda", "can of soda of your choice", 140, true, 1.50);
		MenuItem item5 = new MenuItem("Impossible item", "calorically impossible", 10, false, 1.00);
		
		addItem(item1);
		addItem(item2);
		addItem(item3);
		addItem(item4);
		addItem(item5);
		
		//Filling menu for testing
		
	}
	
	public MenuIterator getAllItems() {
		return new MenuIteratorAllItems(menu);
	}
	
	public MenuIterator getHeartHealthy(){
		return new MenuHeartHealthyIterator(menu);
	}
	
	public MenuIterator getLowCalory(){
		return new MenuLowCalorIterator(menu);
	}
	
	public void addItem(MenuItem newMenuItem){
		menu.add(newMenuItem);
	}

}
