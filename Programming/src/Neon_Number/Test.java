package Neon_Number;

public interface Test {
	public static void neon(int number)
	{
		int temporary=number*number;
		int sum=0;
		while(temporary!=0)
		{
			sum+=temporary%10;
			temporary/=10;
		}
		if(sum==number)
		{
			System.out.println("it is a neon number");
		}
		else
		{
			System.out.println("it is not a  neon number");
		}
	}

}
