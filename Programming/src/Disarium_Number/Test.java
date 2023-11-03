package Disarium_Number;

public interface Test {

	public static void disariumCheck(int num) {
		// System.out.println(count(num));
		int count = count(num);
		// System.out.println(count);
		int temp = num;
		int sum = 0;
		while (temp != 0) {
			sum += power(temp % 10, count);
			temp /= 10;
			count--;

		}
		// System.out.println(sum);
		if (num == sum) {
			System.out.println(num + " is a Disarium Number");
		} else {
			System.out.println(num + " is not a Disarium Number");
		}

	}

	public static int count(int number) {
		int count = 0;
		while (number != 0) {
			number /= 10;
			count++;
		}
		return count;
	}

	public static int power(int base, int power) {
		int number = 1;
		for (int i = 0; i < power; i++) {
			number *= base;
		}
		// System.out.println(number);
		return number;
	}
}
