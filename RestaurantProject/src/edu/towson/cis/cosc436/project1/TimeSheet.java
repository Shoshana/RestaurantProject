package edu.towson.cis.cosc436.project1;

import java.util.Date;
import java.util.HashMap;

public class TimeSheet {

	Date startDate;
	Date endDate;
	HashMap<Double, Date> dailyHours;
	
	public TimeSheet(Date startDate, Date endDate,
			HashMap<Double, Date> dailyHours) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.dailyHours = dailyHours;
	}
	
	
}
