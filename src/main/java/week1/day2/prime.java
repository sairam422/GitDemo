package week1.day2;

public class prime {

	static boolean is_Prim(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	static int fin_Prime(int n) {
		int num = n + 1;

		while (num > 0) {

			if (is_Prim(num))
				return num;

			num = num + 1;
		}
		return 0;
	}

	static int minNumber(int arr[], int n) {
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += arr[i];

		if (is_Prim(sum))
			return 0;

		int num = fin_Prime(sum);
		return num - sum;
	}

	public static void main(String[] args) {
		int arr[] = { 100, 200, 28, 24, 22 };
		int n = arr.length;
		System.out.println(minNumber(arr, n));
	}
}
