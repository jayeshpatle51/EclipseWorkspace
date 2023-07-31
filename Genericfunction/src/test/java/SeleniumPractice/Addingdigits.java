package SeleniumPractice;

public class Addingdigits {

	public static int addingDigitsInStringBySrikar(String str) {

		String temp = "0";
		int num = 0;
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (Character.isDigit(c)) {

				temp = temp + c;
				if (i == str.length() - 1) {
					num = num + Integer.parseInt(temp);
				}
			} else {

				num = num + Integer.parseInt(temp);
				temp = "0";
			}

		}
		return num;
	}

	public static String reverseAlphasubstrsepBydiginString(String str) {

		String temp = "";

		String output = "";
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (Character.isAlphabetic(c)) {

				temp = temp + c;
				if (i == str.length() - 1 || !Character.isAlphabetic(str.charAt(i + 1))) {
					output = output + new StringBuilder(temp).reverse();
					temp = "";
				}

			} else {

				output = output + str.charAt(i);
			}

		}
		return output;
	}

	public static int sumofContDigitsByKarthik(String str) {

		Integer temp = 0;
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {

			while (i < str.length() && Character.isDigit(str.charAt(i))) {

				int num = Integer.parseInt("" + str.charAt(i));
				temp = (temp * 10) + num;
				i++;
			}

			sum = sum + temp;
			temp = 0;

		}
		return sum;
	}

	public static void main(String[] args) {

		String str = "Karthi234rth351k45";

		System.out.println(sumofContDigitsByKarthik(str));
		String output = reverseAlphasubstrsepBydiginString(str);
		System.out.println(output);

		String s = "Karthi234rth351k45";
		// ArrayList<Integer> list1=new ArrayList<Integer>();
		// ArrayList<String> list2=new ArrayList<String>();
		StringBuilder sb = new StringBuilder(s.length());
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLetter(c)) {
				sb.insert(j, c);
			} else {
				sb.append(c);
				j = i + 1;
			}
		}
		System.out.println(sb.toString());

	}

}
