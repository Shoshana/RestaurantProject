package edu.towson.cis.cosc436.project1;

import java.util.Iterator;

import edu.towson.cis.cosc436.project1.menu.Menu;
import edu.towson.cis.cosc436.project1.menu.MenuIterator;

public class RunningThings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Menu menu = new Menu();
		MenuIterator heartHealthyIt = menu.getHeartHealthy();
		MenuIterator lowCalIt = menu.getLowCalory();
		MenuIterator completeMenu = menu.getAllItems();
		
		System.out.println("heart healthy");
		while(heartHealthyIt.hasNext()){
			System.out.println(heartHealthyIt.next().toString());
		}
		System.out.println();
		
		System.out.println("loc cal");
		while(lowCalIt.hasNext()){
			System.out.println(lowCalIt.next().toString());
		}
		System.out.println();
		
		System.out.println("Complete menu");
		while(completeMenu.hasNext()){
			System.out.println(completeMenu.next().toString());
		}
		
	}

}
