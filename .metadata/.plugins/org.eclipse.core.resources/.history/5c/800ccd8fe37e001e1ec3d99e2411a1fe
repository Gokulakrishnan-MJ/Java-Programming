package StrictlyIncreasingArray;

public interface Test {

	static void check(int[] arr) {
		boolean status=true;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i + 1] >arr[i]) {
				status=true;
			}
			else
			{
				status=false;
				break;
			}
		}
		if(status) {
			System.out.println("Strictly Increasing Array");
		}
		else
			System.out.println("Not a Strictly Increasing Array");

	}
}
