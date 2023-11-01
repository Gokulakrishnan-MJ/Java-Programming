package arrays;

public class utilization {
	public static void main(String[] args) {
		int[] primitiveArray;
		primitiveArray =new int[6];
		primitiveArray[0]=1;
		primitiveArray[1]=2;
		primitiveArray[2]=3;
		primitiveArray[3]=4;
		primitiveArray[4]=5;
		primitiveArray[5]=6;
		System.out.println("Utilization using for loop");
		{
			for(int i=0;i<primitiveArray.length;i++)
			{
				System.out.print(primitiveArray[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Utilization using while loop");
		
		int b=0;
		while(b<primitiveArray.length)
		{
			System.out.print(primitiveArray[b]+" ");
			b++;
		}
		System.out.println();
		System.out.println("Utilization using do while loop");
		int c=0;
		do
		{
			System.out.print(primitiveArray[c]+" ");
			c++;
		}
		while(c<primitiveArray.length);
		System.out.println();
		System.out.println("Utilization using for each loop");
		for(int d:primitiveArray)
		{
			System.out.print(d+" ");
		}
	}

}
