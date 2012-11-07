package edu.towson.cis.cosc436.project1.menu;

import java.util.LinkedList;

public class MenuLowCalorIterator implements MenuIterator {
	private LinkedList<MenuItem> menu;
	int maxCalories = 100;
	private int index = 0;
	
	public MenuLowCalorIterator(LinkedList<MenuItem>  menu){
		this.menu = menu;
	}
	
	@Override
	public boolean hasNext() {
		while(index < menu.size()){
			if(menu.get(index).getCalories() <= maxCalories){
				return true;
			}
			else{
				index++;
			}
		}
		return false;
	}

	@Override
	public MenuItem next() {
		while(index < menu.size()){
			if(menu.get(index).getCalories() <= maxCalories){
				return menu.get(index++);
			}
			else{
				index++;
			}
		}
		return null;
	}

	int getMaxCalories() {
		return maxCalories;
	}

	void setMaxCalories(int maxCalories) {
		this.maxCalories = maxCalories;
	}
}
