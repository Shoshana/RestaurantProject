package edu.towson.cis.cosc436.project1.menu;

import java.util.LinkedList;

public class MenuHeartHealthyIterator implements MenuIterator {
	
	private LinkedList<MenuItem> menu;
	private int index = 0;
	
	public MenuHeartHealthyIterator(LinkedList<MenuItem>  menu){
		this.menu = menu;
	}
	
	@Override
	public boolean hasNext() {
		while(index < menu.size()){
			if(menu.get(index).isHeartHealthy()){
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
			if(menu.get(index).isHeartHealthy()){
				return menu.get(index++);
			}
			else{
				index++;
			}
		}
		return null;
	}
}
