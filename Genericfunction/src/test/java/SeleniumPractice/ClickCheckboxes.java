package SeleniumPractice;

public class ClickCheckboxes {

	public static int secondHighestnoInarray(int[] nos) {

		int sechighest = nos[0] - 1;
		int firsthighest = nos[0] - 1;
		for (int i = 0; i < nos.length; i++) {

			if (nos[i] > firsthighest) {
				sechighest = firsthighest;
				firsthighest = nos[i];
			} else if (nos[i] > sechighest) {
				sechighest = nos[i];
			}

		}
		return sechighest;
	}

	public int signFunc(long x) {
		if (x > 0) {
			return 1;
		} else if (x == 0) {
			return 0;
		} else {
			return -1;
		}
	}

	public int arraySign(int[] nums) {

//		BigInteger product = new BigInteger();
//		for (int i = 0; i < nums.length; i++) {
//			product = product *(BigInteger)nums[i];
//		}
//		return signFunc(product);

		int pro = 1;
		for (int i = 0; i < nums.length; i++) {
			pro *= nums[i];
			if (pro < 0)
				pro = -1;
			else if (pro > 0)
				pro = 1;
		}
		return pro;
	}

	public static boolean isrotation(String str1, String str2) {

		boolean b = false;

		int j = str1.length() - 1;

		for (int i = 0; i < str1.length(); i++) {

			if (str1.equals(str2)) {
				System.out.println(str2);
				b = true;
				break;
			}
			char c = str2.charAt(j);
			str2 = c + str2.substring(0, str1.length() - 1);

		}
		return b;
	}

	public static void findmissingnoInarray(int[] input) {

		int index = 0;
		for (int i = 1; i <= input[input.length - 1]; i++) {
			int count = 0;
			int j;
			for (j = index; j < input.length; j++) {
				if (i == input[j]) {
					count++;
				} else {
					break;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
			index = j;

		}
	}

	public static void firstNonrepeatingchar(String str) {

		StringBuffer st = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {

			int count = 1;
			if (st.indexOf(str.charAt(i) + "") == -1) {

				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {

						count++;
					}
				}
			}
			if (count == 1) {
				System.out.println(str.charAt(i));
				break;
			}

		}
	}

	public static void main(String[] args) {

//		int[] nums = { 41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43, 83, 78, 82,
//				70, 15, -41 };

//		int[] nums = { 9, 72, 34, 29, -49, -22, -77, -17, -66, -75, -44, -30, -24 };
//		ClickCheckboxes c = new ClickCheckboxes();

//		List<String> list1 = new ArrayList<>();
//
//		List<String> list2 = new ArrayList<>();
//
//		list1.addAll(Arrays.asList("Hyderabad", "Banglore", "Mumbai", "Chennai"));
//
//		list2.addAll(Arrays.asList("Hyderabad", "Mumbai", "Pune"));
//
//		list1.retainAll(list2);
//		System.out.println(list1);

		String str = "swiss";

//		Input: nums1 = [1,2,3], nums2 = [2,4,6,5];
//	    Output: [[1,3],[4,6,5]];

//		int no = 8;
//
//		boolean b = false;
//
//		for (int i = 2; i < no; i++) {
//
//			if (no % i == 0) {
//				b = true;
//				break;
//
//			}
//		}
//
//		if (no == 1 || b) {
//			System.out.println("The given no is not prime");
//		} else if (no == 2 || !b) {
//			System.out.print("The given no is  prime");
//		}
//		System.out.println();
//
//		boolean k = true;
//		int num = 14;
//		// int temp = num + 1;
//		int i = 2;
//
//		while (k) {
//			num++;
//			for (i = 2; i < num; i++) {
//
//				if (num % i == 0) {
//
//					k = true;
//					break;
//				} else {
//					k = false;
//				}
//
//			}
////			if (k) {
////				temp++;
////			}
//		}
//
//		System.out.println(num);

//		int sechighest = nos[0] - 1;
//		int firsthighest = nos[0];
//		for (int i = 1; i < nos.length; i++) {
//
//			if (nos[i] > firsthighest) {
//				firsthighest = nos[i];
//			}
//		}
//
//		System.out.println(firsthighest);
//
//		for (int j = 1; j < nos.length; j++) {
//			if (sechighest < nos[j] && nos[j] < firsthighest) {
//				sechighest = nos[j];
//			}
//		}
//		System.out.println(sechighest);
		// System.out.println(max);
	}

}
