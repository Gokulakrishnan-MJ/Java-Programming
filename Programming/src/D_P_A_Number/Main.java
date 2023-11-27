package D_P_A_Number;
// Deficient Number Perfect Number Abundant Number
public interface Main {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		System.out.print("the Factors are : ");
		Test.check(num);
		
		
	}

}
