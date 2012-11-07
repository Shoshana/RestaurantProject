package edu.towson.cis.cosc436.project1;

public class StaffSchedule {
	TimeSheet timeSheet;
	Double	payPerHour;
	public StaffSchedule(TimeSheet timeSheet, Double payPerHour) {
		super();
		this.timeSheet = timeSheet;
		this.payPerHour = payPerHour;
	}
	public StaffSchedule() {
	}
}
