package Harshad_niven_number;

public interface Main {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the number :");
		int number=sc.nextInt();
		Test.harshad(number);
		
		
	}
}
