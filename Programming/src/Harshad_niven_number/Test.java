package Harshad_niven_number;

public interface Test {

	static void harshad(int number) {
		int temp=number;
		int sum=0;
		while(temp!=0)
		{
			sum+=temp%10;
			temp/=10;
		}
		if(number%sum==0)
		{
			System.out.println(number+" is a Harshad/Niven Number");
		}
		else
		{
			System.out.println(number +" is not a Harshad/Niven number");
		}
		
	}

}
