package Mainproject.simpleproject;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Stack;

public class array {
	static String reversestring(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			str1 = str.charAt(i) + str1;
		}
		return str1;
	}

	public void method1() {
		System.out.print("Jayesh");

	}

	public void method2() {
		System.out.print("\n");
		method1();
		System.out.print(" patle");
	}

	public static String englishTime(String input) throws ParseException {

		// Format of the date defined in the input String
		DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");

		// Change the pattern into 24 hour format
		DateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date time = null;
		String output = "";

		// Converting the input String to Date
		time = dateFormat.parse(input);

		// Changing the format of date
		// and storing it in
		// String
		output = format.format(time);
		return output;
	}

	public static String converttimeto24(String str) {

		StringBuffer sb = new StringBuffer();
		int n = str.length();
		// Get hours
		int h1 = str.charAt(1) - '0';
		int h2 = str.charAt(0) - '0';
		int hh = (h2 * 10 + h1 % 10);

		// If time is in "AM"
		if (str.charAt(n - 2) == 'A') {
			if (hh == 12) {
				sb.append("00");
				for (int i = 2; i <= 7; i++)
					sb.append(str.charAt(i));
			} else {
				for (int i = 0; i <= 7; i++)
					sb.append(str.charAt(i));
			}
		}

		// If time is in "PM"
		else {
			if (hh == 12) {
				sb.append("12");
				for (int i = 2; i <= 7; i++)
					sb.append(str.charAt(i));
			} else {
				hh = hh + 12;
				sb.append(hh);
				for (int i = 2; i <= 7; i++)
					sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

	public static void plusMinus(List<Integer> arr) {
		long n = arr.size();
		float countneg = 0f;
		float countzero = 0f;
		float countpos = 0f;
		for (int i = 0; i < n; i++) {
			if (arr.get(i) < 0) {
				countneg++;
			}
			if (arr.get(i) == 0) {
				countzero++;
			}
			if (arr.get(i) > 0) {
				countpos++;
			}
		}

		float negratio = countneg / n;
		float posratio = countpos / n;
		float zeroratio = countzero / n;
		System.out.format("%.6f" + "\n", negratio);
		System.out.format("%.6f" + "\n", posratio);
		System.out.format("%.6f" + "\n", zeroratio);

	}

	public static int median(List<Integer> arr) {
		int median = 0;
		Collections.sort(arr);
		median = arr.get(arr.size() / 2);
		return median;
	}

	public static boolean isBalanced(String s) {
		int len = s.length();
		if (len == 0 || s == null)
			return true;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
				stack.push(s.charAt(i));
			else if (s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(')
				stack.pop();
			else if (s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[')
				stack.pop();

			else if (s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{')
				stack.pop();
			else
				return false;

		}
		return stack.empty();
	}

	static void printSubStr(String str1, int l, int h) {
		System.out.println(str1.substring(l, h + 1));
	}

	static int longPalSubstr(String str1) {
		int n = str1.length();
		boolean table[][] = new boolean[n][n];
		int mLength = 1;
		for (int i = 0; i < n; ++i)
			table[i][i] = true;
		int strt = 0;
		for (int i = 0; i < n - 1; ++i) {
			if (str1.charAt(i) == str1.charAt(i + 1)) {
				table[i][i + 1] = true;
				strt = i;
				mLength = 2;
			}
		}
		for (int k = 3; k <= n; ++k) {
			for (int i = 0; i < n - k + 1; ++i) {
				int j = i + k - 1;
				if (table[i + 1][j - 1] && str1.charAt(i) == str1.charAt(j)) {
					table[i][j] = true;

					if (k > mLength) {
						strt = i;
						mLength = k;
					}
				}
			}
		}
		System.out.print("The longest palindrome substring in the given string is; ");
		printSubStr(str1, strt, strt + mLength - 1);
		return mLength;
	}

	public static void allInterleavings(String res, String P, String Q, List<String> out) {
		if (P.length() == 0 && Q.length() == 0) {
			out.add(res);
			return;
		}
		if (P.length() > 0) {
			allInterleavings(res + P.charAt(0), P.substring(1), Q, out);
		}
		if (Q.length() > 0) {
			allInterleavings(res + Q.charAt(0), P, Q.substring(1), out);
		}
	}

	static final int NOOFCHARS = 256;

	static char get2ndMostFreq(String str1) {

		int[] ctr = new int[NOOFCHARS];
		int i;
		for (i = 0; i < str1.length(); i++)
			(ctr[str1.charAt(i)])++;

		int ctr_first = 0, ctr_second = 0;
		for (i = 0; i < NOOFCHARS; i++) {
			if (ctr[i] > ctr[ctr_first]) {
				ctr_second = ctr_first;
				ctr_first = i;
			} else if (ctr[i] > ctr[ctr_second] && ctr[i] != ctr[ctr_first])
				ctr_second = i;
		}
		return (char) ctr_second;
	}

	public long factorial(long limit) {

		if (limit == 0)
			return 1;
		else
			return limit * factorial(limit - 1);
	}

	public String reverse(String str) {
		char c = str.charAt(str.length() - 1);
		String s = "";
		s = s + c;
		return s + reverse(str.substring(0, str.length() - 1));
	}

	public static String getCommonPrefix(String[] arr) {

		String s = "";

		String s1 = arr[0];

		for (int i = 0; i < s1.length(); i++) {

			boolean b = false;
			try {
				for (int j = 1; j < arr.length; j++) {

					if (s1.charAt(i) != arr[j].charAt(i)) {
						b = true;
						break;
					}
				}
			} catch (Exception e) {
				return s;
			}
			if (b) {
				break;
			} else {
				s = s + s1.charAt(i);
			}

		}

		return s;
	}

	public static String getCommonPrefix1(String[] arr) {

		String out = arr[0];
		String temp = "";

		for (int i = 1; i < arr.length; i++) {
			int n = 0;

			while (n < out.toCharArray().length && n < arr[i].toCharArray().length) {
				if (out.toCharArray()[n] == arr[i].toCharArray()[n]) {
					temp = temp + out.toCharArray()[n];
				} else {
					break;
				}
				n++;
			}
			out = temp;
			temp = "";
		}
		return out;

	}

	public static void main(String[] args) throws IOException, InterruptedException {

		String arr[] = { "Hyderabad", "Bangalore", "Mumbai", "Chennai", "Madurai", "Vishakhapattanam" };

	}
}
