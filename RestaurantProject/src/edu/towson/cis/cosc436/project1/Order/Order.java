package edu.towson.cis.cosc436.project1.Order;

import java.util.LinkedList;

public class Order{
	private LinkedList<OrderItem> order = new LinkedList<OrderItem>();
	String customer;
	int tableNum;
	
	public Order(){
	}
	
	public OrderIterator getAllItems() {
		return new OrderIteratorAllItems(order);
	}
	
	public void addItem(OrderItem newMenuItem){
		order.add(newMenuItem);
	}

}
