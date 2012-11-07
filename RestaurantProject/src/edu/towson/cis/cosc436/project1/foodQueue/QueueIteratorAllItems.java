package edu.towson.cis.cosc436.project1.foodQueue;

import java.util.LinkedList;

public class QueueIteratorAllItems implements QueueIterator {

	private LinkedList<QueueItem> menu;
	private int index = 0;

	public QueueIteratorAllItems(LinkedList<QueueItem>  menu){
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
	public QueueItem next() {
		return menu.get(index++);
	}
}
