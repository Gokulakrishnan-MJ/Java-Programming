package StrictlyIncreasingArray;

public interface Main {
	java.util.Scanner sc=new java.util.Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the size of the Array : ");
		int size=sc.nextInt();
		System.out.println("Enter the Elements of the Array : ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		Test.check(arr);
	}
	

}
