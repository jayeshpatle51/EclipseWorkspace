package javaprograms;

import java.util.Arrays;

public class GetMissingnos {

	public static void printMissingNos(int start, int limit, int arr[]) {

		int temp = 0;

		for (int i = start; i <= limit; i++) {

			if (i != arr[temp]) {
				System.out.println(i);

			} else if (temp < arr.length - 1) {
				temp++;

			} else if (arr[temp] < i) {
//				while (i <= limit) {
//					System.out.println(i);
//					i++;
//				}
				continue;
			}

		}

	}

	public static void printMissingdup(int[] numbers) {

		int min = numbers[0];
		int max = numbers[numbers.length - 1];

		int k = 0;

		for (int i = min; i <= max; i++) {

			if (numbers[k] == i) {
				k++;
			} else if (numbers[k] == numbers[k - 1]) {


				k++;
				i--;
				continue;
			} else {
				System.out.println(i);
			}


		}
	}

	public static void miss_Number() {
		int[] a = { 10, 5, 8, 2, 1, 5, 8 };
		Arrays.sort(a);
		for (int i = 0; i < a.length - 1; i++) {

			if (a[i + 1] - a[i] > 1) {

				int temp = a[i + 1] - a[i];

				for (int j = 1; j < temp; j++) {

					System.out.print(a[i] + j + " ");
				}
				// temp = 0;
			}
		}
	}
	public static void main(String[] args) {

		int numbers[] = { 2, 2, 3, 3, 3, 4, 5, 8 };

//		int start = numbers[0];
//		int limit = numbers[numbers.length - 1];

		// printMissingdup(numbers);
		miss_Number();
	}

}
