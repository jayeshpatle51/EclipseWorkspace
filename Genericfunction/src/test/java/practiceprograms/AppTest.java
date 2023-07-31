package practiceprograms;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class AppTest {

	public <T> T[] rotateArray(T[] arr) {

		T initial = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {

			T temp = arr[i];
			arr[i] = arr[i + 1];

		}
		arr[arr.length - 1] = initial;
		return arr;
	}

	public static int count(String str, char c) {
		int coun = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				coun++;
			}
		}
		return coun;
	}

	public <T> void countusingSet(List<T> list) {

		Set<T> set = new HashSet<>();

		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					count++;

				}
			}
			if (set.add(list.get(i))) {
				System.out.println(list.get(i) + " " + count);
			}
		}

	}

	public static int fibonacci(int number) {

		if (number == 0 || number == 1) {
			return number;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);

	}

	public static void quitalldriver(WebDriver[] drivers) {

		for (int i = 0; i < drivers.length; i++) {
			drivers[i].quit();
		}

	}

	public static int gcd(int a, int b) {
		while (((a > 0) && (b > 0))) {
			if ((a > b)) {
				a = (a % b);
			} else {
				b = (b % a);
			}
		}
		if ((a == 0)) {
			return b;
		} else {
			return a;
		}
	}

	public static String kangaroo(int x1, int v1, int x2, int v2) {

		int vdiff = v1 - v2;
		if (vdiff <= 0) {

			return "NO";
		}
		int xdiff = x1 - x2;
		if (xdiff % vdiff == 0) {
			return "YES";
		}
		return "NO";
	}

	public Set<String> anaGramSet(List<String> list) {

		Set<String> set = new HashSet<>();
		for (int i = 0; i < list.size(); i++) {

			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i).length() == list.get(j).length()) {
					char[] arr1 = list.get(i).toCharArray();
					char[] arr2 = list.get(j).toCharArray();
					Arrays.sort(arr1);
					Arrays.sort(arr2);
					if (Arrays.equals(arr1, arr2)) {
						set.add(list.get(i));
					} else {
						continue;
					}
				}
			}
		}
		return set;
	}

	public double brokerage(int investment, int total) {

		int Turnover = total + investment;
		double brokerage = Turnover * 0.05 / 100;
		if (brokerage < 20) {
			return brokerage;
		} else {

			return 20;
		}
	}

	public List<String> sepeateTypes(String str) {

		List<String> list = new ArrayList<>();
		if (str.isEmpty() && str.isBlank()) {
			System.out.println("This string is blank");
			return list;
		} else {
			String Upalpha = "", Lowalpha = "", nos = "", spch = "";
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
					Upalpha = Upalpha + str.charAt(i);
				} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					Lowalpha = Lowalpha + str.charAt(i);
				} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
					nos = nos + str.charAt(i);
				} else {
					spch = spch + str.charAt(i);
				}
			}
			list = Arrays.asList(Upalpha, Lowalpha, nos, spch);

			return list;
		}
	}

	public void run() {
		System.out.println("Hello world" + Thread.currentThread().getName());
	}

	public static boolean ispowerOfno(int no1, int powerOf) {

		int temp = no1;
		boolean flag = true;
		while (temp >= powerOf) {

			if (temp % powerOf != 0) {

				flag = false;
				// break;
			}
			temp = temp / powerOf;
		}
//		while(temp<=no1) {
//			if(temp==no1) {
//				flag=true;
//			}
//			temp=temp*powerOf;
//		}
		return flag;

	}

	public static long binaryToDecimal(long binary) {
		long decimal = 0;
		int pow = 0;
		while (binary > 0) {
			double po = Math.pow(2, pow);
			long rem = binary % 10;
			decimal = decimal + (rem * (int) po);
			binary = binary / 10;
			pow++;
		}
		return decimal;
	}

	public static String DecimalToBinary(int decimal) {

		String binary = "";

		while (decimal > 0) {

			int rem = decimal % 2;
			decimal = decimal / 2;
			binary = binary + rem;

		}
		binary = new StringBuilder(binary).reverse().toString();
		return binary;
	}

	public static String fractionalTobinary(double fraction) {
		String binary = "";

		int decimal = (int) fraction;
		String newbinary = DecimalToBinary(decimal);
		fraction = fraction - decimal;
		while (fraction > 0) {
			double number = fraction * 2;
			decimal = (int) number;
			binary = binary + decimal;
			if (decimal == 1) {
				fraction = number - decimal;
			} else {
				fraction = number;
			}
		}

		String sub = binary.substring(0, 8);
		String finalbinary = newbinary + "." + sub;
		return finalbinary;
	}

	public static String firstReapeatingChar(String str) {

		int repind = 0;
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			int ind = 1;
			boolean b = false;
			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {
					ind++;

				}

			}
			if (ind > 1) {
				b = true;
				repind = i;
				break;
			}
			res = res + str.charAt(i);
		}
		res += str.substring(repind + 1);

		return res;
	}

	public static String removerepeatingcharByGopi(String s) {

		char[] c = s.toCharArray();
		int a = 0;
		int b = s.length();
		String temp = "";
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j] & b > j) {
					a = i;
					b = j;
				}
			}
		}
		// System.out.println(" ");
		for (int i = 0; i < c.length; i++) {
			if (i != b) {
				temp = temp + c[i];
			}
		}
		return temp;
	}

	public static String removeFirstRepeatedChar(String s) {

		String newstr = "";
		List<Character> list = new ArrayList<>();
		int i;
		boolean b = false;
		for (i = 0; i < s.length(); i++) {

			if (list.contains(s.charAt(i))) {
				b = true;
				break;
			}
			list.add(s.charAt(i));
			newstr += s.charAt(i);
		}
		if (b) {
			newstr += s.substring(i + 1);
		} else {
			return " There is no repeating character in this string " + newstr;
		}
		return newstr;
	}

	public static String reverseStringInAlphanumString(String str) {

		String newstring = "";
		StringBuilder sb = new StringBuilder();
		boolean b = false;
		List<String> list = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {

			if (!Character.isAlphabetic(str.charAt(i))) {
				b = true;
				if (!list.contains(sb.toString())) {

					newstring = newstring + sb.reverse().toString();
					list.add(sb.toString());
				}
				if (Character.isAlphabetic(str.charAt(i + 1))) {
					sb = sb.delete(0, sb.length());
				}

			} else {
				sb.append(str.charAt(i));
			}

			if (b) {
				newstring += str.charAt(i);
				b = false;
			}
			if (i == str.length() - 1) {
				newstring = newstring + sb.reverse().toString();
				break;
			}
		}
		return newstring;
	}

	public static void removeDuplicate2() {
		String s = "this is a string";
		String out = "";
		Set set = new HashSet();
		for (int i = 0; i <= s.length() - 1; i++) {
			if (set.add(s.charAt(i))) {
				out = out + s.charAt(i);
			}
		}
		System.out.println(out);
	}

	public static String removeDuplicate3(String str) {
		boolean b = true;
		if (str.equals("")) {
			return "String is empty";
		}

		String unique = "";
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					b = false;
					count++;
				}

			}
			if (count == 1) {
				unique += str.charAt(i);

			}
		}
		if (b) {
			return "String has no duplicate values";
		}
		return unique;
	}

	public static Integer sumofcontinousDigitsInstring(String str) {

		List<Integer> list = new ArrayList<>();
		Integer temp = 0;
		Integer sum = 0;
		for (int i = 0; i < str.length(); i++) {
			// boolean b=false;
			if (Character.isDigit(str.charAt(i))) {
				int num = Integer.parseInt("" + str.charAt(i));
				temp = (temp * 10) + num;

				if (i == str.length() - 1 || !Character.isDigit(str.charAt(i + 1))) {
					list.add(temp);
					System.out.println(temp);
					temp = 0;
				}

			}
		}

		for (int m = 0; m < list.size(); m++) {
			sum = sum + list.get(m);
		}
		return sum;
	}

	public static <T> void genericExample(T type) {
		System.out.println(type);
	}

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		// genericExample("Jayes");
		String input = "Automation%Selenium$Practice#";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '%' || ch == '$' || ch == '#') {
				System.out.println(ch + " at position " + (i + 1));
			}
		}

//		for (int m = 0; m < list.size(); m++) {
//			sum = sum + list.get(m);
//		}
//		System.out.println(sum);
		// String str1 = "H789_673+68";

//		String newstr = "";
//		List<Character> list = new ArrayList<>();
//		for (int i = 0; i < str.length(); i++) {
//
//			if (!list.contains(str.charAt(i))) {
//				int count = 1;
//				for (int j = i + 1; j < str.length(); j++) {
//
//					if (str.charAt(i) != str.charAt(j)) {
//						break;
//					}
//					count++;
//				}
//				list.add(str.charAt(i));
//				newstr = newstr + str.charAt(i) + "" + count;
//			}
//
//		}
//		System.out.println(newstr);
//		String newstr = "";
//		int ind = -1;
//		// Map<Character, Integer> map = new HashMap<>();
//		for (int i = 0; i < str.length(); i++) {
//
//			for (int j = i + 1; j < str.length(); j++) {
//				if (str.charAt(i) == str.charAt(j)) {
//					ind = i;
//					break;
//				}
//			}
//
//			if (ind != -1) {
//				break;
//			}
//
//		}
//		StringBuilder sb = new StringBuilder(str);
//		String fin = sb.replace(ind, ind + 1, "").toString();
//		// newstr += str.substring(ind + 1);
//		// System.out.println(fin);
//		String mai = firstReapeatingChar(str);
//		System.out.println(mai);
//		 String my_str="1234";
//	      Pattern my_pattern = Pattern.compile("[0-9]");
//	      Matcher my_match = my_pattern.matcher(my_str);
		// boolean check = my_match.find();
//		 if(Pattern.compile("^[0-9]*$").matcher(my_str).find()) {
//			 System.out.println("only numeric");
//		 }else if(Pattern.compile("^[A-z]*$").matcher(my_str).find()) {
//			 System.out.println("only alphabetic");
//		 }else if(Pattern.compile("^[a-zA-Z0-9]*$").matcher(my_str).find()){
//			System.out.println("alphanumeric");
//		}else if (Pattern.compile("^[A-z0-9!-/:-@]*$").matcher(my_str).find()){
//			System.out.println("alpha numeric and special char");
//		}else {
//			System.out.println("Given string does not match with any condition");
//		}
//		String strout=my_str.replaceAll("^[0-9]", "_").replaceAll("^[A-z]", "-");
//	 if(strout.contains("_") && strout.contains("-")) {
//		 System.out.println("alpha numeric and special char");
//	 }

//	 if(strout.contains("_") && !(strout.contains("-"))) {
//		 System.out.println("only numeric");
//	 }
//
//	 if(!(strout.contains("_")) && strout.contains("-")) {
//		 System.out.println("only alphabetic");
//	 }

//	        1
//	        1 2
//	        1 2 4
//	        1 2 4 8
//	        1 2 4 8 16
//	        1 2 4 8 16 32

	}
//        for(int i=0;i<str.length();i++)
//        {
//            Character c=str.charAt(i);
//            //System.out.println(c);
//                if(Character.isAlphabetic(c))
//                {
//                    alpha=alpha+str.charAt(i)+"";
//                }
//                else if(Character.isDigit(c))
//                {
//                    num=num+c;
//                }else
//                {
//                    spl=spl+c+"";
//                }
//        }
//        System.out.println(alpha);
//        System.out.println(num);
//        System.out.println(spl);

//	@Override
//	public void m1() {
//		System.out.println("mw");
//
//
//	}

}
