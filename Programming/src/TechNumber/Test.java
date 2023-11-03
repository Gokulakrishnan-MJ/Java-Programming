package TechNumber;

public interface Test {

	static void techNumber(int num) {
		int temporary=num;
		int remainder=num%100;
		int quotient=num/100;
		int sum=remainder+quotient;
		int square=sum*sum;
		if(num==square)
		{
			System.out.println(num+" is a Tech Number");
		}
		else
		{
			System.out.println(num+" is not a Tech Number");
		}
		
	}

}
