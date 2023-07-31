package Generic_methods;

import java.util.HashMap;
import java.util.Map;

public class ConstructorChaining {

	ConstructorChaining() {

	}

	public static Character removingduplicates(String s) {

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(map.get(s.charAt(i)), 1));
		}

		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() == 1) {
				return m.getKey();

			} else {
				continue;
			}
		}
		return null;
	}

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

		String str = "abbcffcam";
		String s = removeAdjacent(str);

	}

}
