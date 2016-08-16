package prototype;

public class Prototype implements Cloneable
{
	
	public Prototype getClone() throws CloneNotSupportedException
	{
		System.out.println();
		return (Prototype) super.clone();
	}

}
