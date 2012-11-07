package edu.towson.cis.cosc436.project1.invoker;

//Silver Team @Stephen Fensterer
public interface Command
{
	public Object Execute();
}

class CMDAdjustPrices implements Command
{
	public Object Execute()
	{
		return "AdjustPrice";
	}
}

class CMDAssignSchedules implements Command
{
	public Object Execute()
	{
		return "AssignSchedule";
	}
}

class CMDCheckFoodStatus implements Command
{
	public Object Execute()
	{
		return "CheckFoodStatus";
	}
}

class CMDEditTimesheet implements Command
{
	public Object Execute()
	{
		return "EditTimesheet";
	}
}

class CMDFoodPickup implements Command
{
	public Object Execute()
	{
		return "FoodPickup";
	}
}

class CMDGetSeated implements Command
{
	public Object Execute()
	{
		return "GetSeated";
	}
}

class CMDIndicateUnavailDishes implements Command
{
	public Object Execute()
	{
		return "IndicateUnavailDishes";
	}
}

class CMDManageFoodQueue implements Command
{
	public Object Execute()
	{
		return "ManageFoodQueue";
	}
}

class CMDManageMenu implements Command
{
	public Object Execute()
	{
		return "ManageMenu";
	}
}

class CMDNotifyWaitstaff implements Command
{
	public Object Execute()
	{
		return "NotifyWaitstaff";
	}
}

class CMDPayForOrder implements Command
{
	public Object Execute()
	{
		return "PayForOrder";
	}
}

class CMDPlaceOrder implements Command
{
	public Object Execute()
	{
		return "PlaceOrder";
	}
}

class CMDRespond implements Command
{
	public Object Execute()
	{
		return "Respond";
	}
}

class CMDSetSpecialOffers implements Command
{
	public Object Execute()
	{
		return "SetSpecialOffers";
	}
}

class CMDSubmitComment implements Command
{
	public Object Execute()
	{
		return "SubmitComment";
	}
}

class CMDSubmitRating implements Command
{
	public Object Execute()
	{
		return "SubmitRating";
	}
}

class CMDTimesheetLogin implements Command
{
	public Object Execute()
	{
		return "TimesheetLogin";
	}
}

class CMDViewFoodQueue implements Command
{
	public Object Execute()
	{
		return "FoodQueue";
	}
}

class CMDViewMenu implements Command
{
	public Object Execute()
	{
		return "ViewMenu";
	}
}

class CMDViewTables implements Command
{
	public Object Execute()
	{
		return "ViewTables";
	}
}

class CMDViewTimesheet implements Command
{
	public Object Execute()
	{
		return "ViewTimesheet";
	}
}
