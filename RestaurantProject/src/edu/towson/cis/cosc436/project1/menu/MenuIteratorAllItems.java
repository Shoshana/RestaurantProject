package edu.towson.cis.cosc436.project1.menu;

import java.util.LinkedList;

public class MenuIteratorAllItems implements MenuIterator {

	private LinkedList<MenuItem> menu;
	private int index = 0;

	public MenuIteratorAllItems(LinkedList<MenuItem>  menu){
		this.menu = menu;
	}
	@Override
	public boolean hasNext() {
		if(index < menu.size()){
			return true;
		}
		return false;
	}

	@Override
	public MenuItem next() {
		return menu.get(index++);
	}
}
