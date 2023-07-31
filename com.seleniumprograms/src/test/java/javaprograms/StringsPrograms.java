package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class StringsPrograms {

	public static int countsinglechar(String str, char ch) {

		if (!str.contains(ch + "")) {
			return 0;
		}
		StringBuilder sb = new StringBuilder(str);
		sb.setCharAt(str.indexOf(ch), '0');
		return countsinglechar(sb.toString(), ch) + 1;
	}

	public static int countsiglecharInoneline(String str, char ch) {

		return str.length() - str.replace(ch + "", "").length();
	}

	public static Map<String, Integer> coutntWordsInstring(String str) {

		Map<String, Integer> map = new HashMap<>();

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		return map;
	}

	public static void main(String[] args) {
		int i;
		for (i = 0; i < 10; i++)
			;
		{

			if (i % 2 == 0)
				;



				System.out.println(i);

		}

	}

}

class Demo {
	int a = 0;

	public Demo() {
		a++;
		System.out.print(a);
	}
}

