package Disarium_Number;

public interface Main {
	
	public static void main(String[] args) {
		java.util.Scanner Scanner=new java.util.Scanner(System.in);
		System.out.println("Enter the Number to check whether it is disarium or not :");
		int num=Scanner.nextInt();
		Test.disariumCheck(num);
	}

}
