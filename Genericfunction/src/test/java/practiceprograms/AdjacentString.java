package practiceprograms;

public class AdjacentString {

	public static String removeAdjacent(String str) {

		StringBuilder st = new StringBuilder(str);
		String newstr = "";
		for (int i = 0; i < str.length(); i++) {
			boolean flag = true;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {

					st.setCharAt(i, '-');
					st.setCharAt(j, '-');
					flag = false;
				} else {
					break;
				}
			}
			if (flag) {
				newstr = newstr + st.charAt(i);
			}
		}
		newstr = newstr.replace("-", "");
		return newstr;

	}

	public static void main(String[] args) {

		String s = "abbcfffcam";

		String newstr = s;
		if (!newstr.isEmpty()) {
			while (stringhasAdjacent(newstr)) {
				newstr = removeAdjacent(newstr);
			}
		} else {
			System.out.println(newstr + "String is empty");
		}

		System.out.println(newstr);
		System.out.println(stringhasAdjacent(s));

	}

	public static boolean stringhasAdjacent(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				return true;
			}
		}

		return false;
	}

}
