package edu.towson.cis.cosc436.project1.invoker;

//team silver @Stephen Fensterer
public class SystemInterface extends Invoker
{
	Invoker c = new Invoker();
	public String getString(Command x)
	{
		return (String) c.Invoke(x);
	}
}
