package factor;

public interface Test {
	
	public static void factor(int number)
	{
		for(int i=1;i<=number/2;i++)
		{
			if(number%i==0)
			{
				System.out.print(" "+i);			}
		}
		System.out.println(" "+number);
	}

}
