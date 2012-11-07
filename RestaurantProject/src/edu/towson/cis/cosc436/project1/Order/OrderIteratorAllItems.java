package edu.towson.cis.cosc436.project1.Order;

import java.util.LinkedList;

public class OrderIteratorAllItems implements OrderIterator {

	private LinkedList<OrderItem> menu;
	private int index = 0;

	public OrderIteratorAllItems(LinkedList<OrderItem>  menu){
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
	public OrderItem next() {
		return menu.get(index++);
	}
}
