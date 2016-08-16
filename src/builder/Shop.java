package builder;

public class Shop 
{

	public static void main(String args[])
	{
		
		// Genral Process
		
		Phone p=new Phone("Android", "Snapdragon",0 , 5.2, 3100);
		System.out.println(p);
		
		
		//Builder Design Patterns
		
		/* Using Builder design pattern we set the values only and return the object
		 * of Phone class. Benefit of this that we can pass the only element which we 
		 * have no need to pass all the values default.
		 */
		
		Phone  p1=new  PhoneBuilder().setBattery(3650).setProcessor("Qualcom").getPhone();
		System.out.println(p1);
		
	}
	
}
