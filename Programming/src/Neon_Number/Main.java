package Neon_Number;
//write a java program to check whether a given number is neon number or not?
public interface Main {
	java.util.Scanner Scanner=new java.util.Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the number :");
		int num=Scanner.nextInt();
		Test.neon(num);
	
	
	}
}
