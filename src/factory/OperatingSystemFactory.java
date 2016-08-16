package factory;

public class OperatingSystemFactory 
{
		public OS getInstance(String str)
		{
			if(str.equals("Android"))
			{
				return new Android();
			}
			else if(str.equals("Windows"))
			{
				return new Windows();
			}
			else 
			{
				return new IOS();
			}
			
		}
}
