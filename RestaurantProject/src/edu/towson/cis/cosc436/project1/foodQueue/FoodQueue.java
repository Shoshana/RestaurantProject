package edu.towson.cis.cosc436.project1.foodQueue;

import java.util.LinkedList;

public class FoodQueue{
	private LinkedList<QueueItem> foodQueue = new LinkedList<QueueItem>();
	
	public FoodQueue(){
	}
	
	public QueueIterator getAllItems() {
		return new QueueIteratorAllItems(foodQueue);
	}
	
	public void addItem(QueueItem newMenuItem){
		foodQueue.add(newMenuItem);
	}

}
