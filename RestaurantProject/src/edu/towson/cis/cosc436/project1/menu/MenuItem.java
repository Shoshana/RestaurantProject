package edu.towson.cis.cosc436.project1.menu;

import java.util.LinkedList;

public class MenuItem {
	String title;
	String description;
	int calories;
	boolean heartHealthy;
	double price;
	LinkedList<String> ingredients;
	
	public MenuItem(String title, String description, int calories,
			boolean heartHealthy, double price/*, LinkedList ingredients*/) {
		this.title = title;
		this.description = description;
		this.calories = calories;
		this.heartHealthy = heartHealthy;
		this.price = price;
//		this.ingredients = ingredients;
	}
	
	public String toString(){
		return title + "\n" + description + "\n" + calories + "\t" + heartHealthy + "\t" + price;
	}
	String getTitle() {
		return title;
	}
	String getDescription() {
		return description;
	}
	int getCalories() {
		return calories;
	}
	boolean isHeartHealthy() {
		return heartHealthy;
	}
	double getPrice() {
		return price;
	}
	
	

}
