package edu.towson.cis.cosc436.project1.Order;

import java.sql.Time;
import java.util.LinkedList;

public class OrderItem {
	String title;
	double price;
	
	public OrderItem(String title) {
		super();
		this.title = title;
	}
	
	public String toString(){
		return title + "\n";
	}
	String getTitle() {
		return title;
	}
}
