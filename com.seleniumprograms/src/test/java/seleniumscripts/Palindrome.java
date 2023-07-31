package seleniumscripts;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "mannam";
		boolean b = true;
		for (int i = 0; i < str.length() / 2; i++) {

			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {

				b = false;
				break;
			}
		}
		System.out.println(b);
	}

}
