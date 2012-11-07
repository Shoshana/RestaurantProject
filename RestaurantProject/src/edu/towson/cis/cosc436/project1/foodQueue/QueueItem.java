package edu.towson.cis.cosc436.project1.foodQueue;

import java.sql.Time;
import java.util.LinkedList;

public class QueueItem {
	String title;
	LinkedList ingredients;
	Time timeOrdered;
	int tableOrderedBy;
	
	public QueueItem(String title) {
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
