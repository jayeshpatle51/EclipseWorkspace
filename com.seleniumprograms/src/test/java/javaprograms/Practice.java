package javaprograms;

import java.util.Arrays;

public class Practice {

	public static boolean findprimeno(int num) {

		int count = 0;

		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				count++;
				if (count > 1) {
					return false;
				}
			}
		}

		return true;

	}

	public static void main(String[] args) {

		int arr[] = new int[10];

		int num = 10;

		int limit = 1;

		for (int i = 0; i < arr.length;) {

			if (findprimeno(limit)) {

				arr[i] = limit;
				i++;
			}

			limit++;
		}

		System.out.println(findprimeno(num));
		System.out.println(Arrays.toString(arr));
	}

}
