package sqrt_cube;

public interface Main {
	java.util.Scanner Scanner=new java.util.Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the number to find the Square");
		int sqr=Scanner.nextInt();
		Test.square(sqr);
		
		
		
		System.out.println("Enter the number to find the Squareroot");
		int sqrroot=Scanner.nextInt();
		Test.squareroot(sqrroot);
		
	}

}
