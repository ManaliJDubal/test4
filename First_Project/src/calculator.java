
public class calculator 
{

	
	public static void main(String[] args) 	
	{
		
		
		
		byte b = 120;
		
		int y = b;
		
		
		
		short s = b;
		int i = s;
		long l = i;
		// automatic conversion/implicit conversion/widening conversion
		
		// truncated/lost
		double pi = 22.0/7;
		System.out.println(pi);
		
		int x =(int)pi;
		//tragetdataype  var = (targetdatatype) source_varname;
		System.out.println(x);
		
		
		float f = (float)pi;
		System.out.println(f);
		
		
		long phone_number = 987654321;
		byte y = (byte)phone_number;
		System.out.println(y);
		
		
		
	}

}

