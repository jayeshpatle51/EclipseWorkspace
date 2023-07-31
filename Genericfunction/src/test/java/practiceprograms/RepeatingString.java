package practiceprograms;

public class RepeatingString {

	public static void main(String[] args) {

		String str = "abcdabcdabcdr";

		int len = str.length();

		boolean flag = true;
		int splitstrlen = len / 3;

		if (len % 3 != 0) {
			flag = false;
		} else {
			String temp = str.substring(0, splitstrlen);
			for (int i = splitstrlen; i < len; i += splitstrlen) {
				String compare = str.substring(i, i + splitstrlen);

				if (!temp.equals(compare)) {
					flag = false;
					break;
				}
			}

		}

		if (flag) {
			System.out.println("String is reapeatable");
		} else {
			System.out.println("String is not repeatable");
		}

	}
}