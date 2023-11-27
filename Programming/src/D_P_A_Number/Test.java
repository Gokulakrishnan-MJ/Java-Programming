package D_P_A_Number;

public interface Test {

	static void check(int number) {
		int sum=0;
			for(int i=1;i<=number/2;i++)
			{
				if(number%i==0)
				{
					sum+=i;			}
			}
			if(sum<number)
				System.out.println(number+" is a Deficient Number");
			else if(sum==number)
				System.out.println(number+" is a Perfect Number");
			else
				System.out.println(number+" is a Abundant Number");
		}
		

}
