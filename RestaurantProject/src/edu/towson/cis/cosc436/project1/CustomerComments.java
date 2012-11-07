package edu.towson.cis.cosc436.project1;

import java.util.LinkedList;

public class CustomerComments {
	LinkedList<Comment> customerComments = new LinkedList<Comment>();
	
	public void addCustomerComment(Comment comment){
		customerComments.add(comment);
	}
}
