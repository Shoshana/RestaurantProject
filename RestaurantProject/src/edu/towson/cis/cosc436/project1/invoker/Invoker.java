package edu.towson.cis.cosc436.project1.invoker;

//silver team @Stephen Fensterer
public class Invoker
{
	public Object Invoke(Command x)
	{
		Object y = x.Execute();
		return  x.Execute() + " Invoked";
	}
}
