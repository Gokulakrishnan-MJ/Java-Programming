package Amicable_Number;

public interface Main {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		int num1=sc.nextInt();
		System.out.println("Enter the Number 2 : ");
		int num2=sc.nextInt();
		Test.amicable(num1, num2);
	}
}
