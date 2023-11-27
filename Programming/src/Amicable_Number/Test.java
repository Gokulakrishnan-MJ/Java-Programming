package Amicable_Number;
// 220 and 284 are perfect example of amicable pair
public interface Test {
	
	public static void amicable(int num1,int num2)
	{
		int factSum1=0;
		int factSum2=0;
		for(int i=1;i<num1;i++)
		{
			if(num1%i==0)
			{
				factSum1+=i;
			}
		}
		for(int i=1;i<num2;i++)
		{
			if(num2%i==0)
			{
				factSum2+=i;
			}
		}
		if(factSum1==num2 || factSum2==num1)
			System.out.println(num1+" and "+num2+" is a amicable pair");
		else
			System.out.println(num1+" and "+num2+" is not a amicable pair");
	}

}
