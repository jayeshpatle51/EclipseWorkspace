package practiceprograms;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.openqa.selenium.By;

public class PatternPrograms {

	public static void equilateralTriangle(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");

		}
	}

	public void Diamondpattern(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");

		}

		for (int i = n - 1; i >= 0; i--) {

			System.out.print(" ");
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

	public void alphbetTriangle(int n) {
		for (int i = 'A'; i <= 'Z'; i++) {
			for (int j = 'A'; j <= i; j++) {
				System.out.print((char) j + " ");
			}
			System.out.println();
		}
	}

	public void alphbetEqualateralTriangle(int n) {

		for (int i = 'A'; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int j = 'A'; j <= i; j++) {
				System.out.print((char) j + " ");
			}
			System.out.println();
		}

	}

	public void diamondOfalphabetics(int n) {

		for (int i = 'A'; i <= n; i = i + 2) {
			for (int j = i; j <= n; j = j + 2) {
				System.out.print(" ");
			}
			for (int j = 'A'; j <= i; j++) {
				if (j == 'A' || j == i) {
					System.out.print((char) j + " ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

		for (int i = n - 2; i >= 'A'; i = i - 2) {
			// System.out.print(" ");
			for (int j = n; j >= i; j = j - 2) {
				System.out.print(" ");
			}
			for (int k = 'A'; k <= i; k = k + 1) {
				if (k == 'A' || k == i) {
					System.out.print((char) k + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void zigzagPattern(int h, int l) {

		int q = h - 1;
		for (int i = 0; i < h; i++) {

			for (int j = 0; j < h * l * 2; j++) {
				if (j % (h * 2) == q) {
					System.out.print("/");
				} else if (j % (h * 2) == h + i) {
					System.out.print("\\");
				} else {
					System.out.print(" ");
				}

			}
			q--;

			System.out.println();
		}

	}

	public static int factorial(int n) {
		if (n == 1) {
			return n;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void signwave(int limit) {

		int start1 = limit - 1;
		int end = limit;
		int start2 = limit * 4 - 1;
		for (int i = 0; i < limit * 2; i++) {

			for (int j = 0; j < limit * 4; j++) {

				if (j == start1) {
					System.out.print("/");
				} else if (j == end) {
					System.out.print("\\");
				} else if (i >= limit && j == start2) {
					System.out.print("/");
					start2--;
				} else {
					System.out.print("-");
				}

			}
			start1--;

			end++;

			System.out.println();
		}
	}

	public static void capYshapePattern(int no) {
		int lim = (no * 2) - 1;
		int temp = lim - 1;
		for (int i = 0; i < lim; i++) {

			for (int j = 0; j < lim; j++) {
				if ((j == i || j == temp) && i < no) {
					System.out.print("*");
				} else if (i >= no && j == no - 1) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}

			}
			temp--;
			System.out.println();
		}
	}

	public static void charpair(List<Character> list) {
		int count = 0;

		for (int i = 0; i < list.size(); i++) {

			for (int j = i + 1; j < list.size(); j++) {
				String st = "";
				st = st + list.get(i);

				st = st + list.get(j);

				count++;
				System.out.println(count + ")" + st);

			}
		}
	}

	public static void numberPattern1(int hor) {

		int ver = (hor * 2) - 1;
		int lim1 = hor;
		int lim2 = hor;
		for (int i = 1; i <= hor; i++) {

			int no = 1;
			int k = i - 1;
			for (int j = 1; j <= ver; j++) {
				if (j < lim1 || j > lim2) {
					System.out.print("  ");

				} else if (no <= i) {
					System.out.print(no + " ");
					no++;
				} else if (k >= 1) {
					System.out.print(k + " ");
					k--;
				}

			}
			lim1--;
			lim2++;

			System.out.println();
		}

	}

	static void yPattern(int n) {

		int i, j;
		for (i = n - 1; i >= 0; i--) {
			// outer gap loop
			for (j = n - 1; j > i; j--) {
				System.out.print("-");
			}

			System.out.print("*");

			// inner gap loop
			for (j = 1; j < (i * 2); j++)
				System.out.print("-");

			if (i >= 1)
				System.out.print("*");
			System.out.print("\n");
		}
		for (int m = 0; m < n; m++) {
			for (int l = 0; l < n; l++) {
				if (l == (n - 1)) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.print("\n");

		}
	}

	static void yShape(int size) {
		int x = size / 2;
		int y = x;
		for (int i = 0; i < size; i++) {
			if (i > x) {
				for (int j = 0; j <= x; j++) {
					System.out.print(" ");
				}
			} else {
				for (int j = 0; j < i; j++)

					System.out.print(" ");

				System.out.print(" *");
				for (int k = 0; k < 2 * y; k++)

					System.out.print(" ");

				y--;
			}
			System.out.println(" *");
		}

	}

	public static void xPattern(int no) {

		int no2 = no - 1;
		for (int i = 1; i <= no; i++) {
			for (int j = 0; j <= no; j++) {
				if (j >= i) {
					System.out.print(j + " ");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

		for (int k = no2; k >= 1; k--) {
			for (int j = 0; j <= no; j++) {
				if (j >= k) {
					System.out.print(j + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void reverseNumPattern(int no) {
		int temp = no;
		for (int i = 1; i <= no; i++) {

			for (int j = 1; j <= no; j++) {
				if (j >= temp) {
					System.out.print(i + " ");
				} else {
					System.out.print("1 ");
				}

			}
			temp--;
			System.out.println();
		}
	}

	public static void increasingno(int no) {
		for (int i = 1; i <= no; i++) {
			int temp = i;
			int newno = no - 1;
			for (int j = 0; j < i; j++) {

				System.out.print(temp + " ");
				temp = temp + newno;
				newno--;
			}
			System.out.println();
		}

	}

	static void yyPattern(int n) {
		int i, j;
		for (i = n - 1; i >= 0; i--) {
			// outer gap loop
			for (j = n - 1; j > i; j--) {
				System.out.print(" ");
			}

			System.out.print("*");

			// inner gap loop
			for (j = 1; j < (i * 2); j++)
				System.out.print(" ");

			if (i >= 1)
				System.out.print("*");
			System.out.print("\n\n");
		}
		for (int m = 0; m < n; m++) {
			for (int l = 0; l < n; l++) {
				if (l == (n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n\n");

		}
	}

	public static void plusPattern1(int n) {

		int m = (n + 1) / 2;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (j == n || i == m) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void plusPattern2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		int i = 1;
		int j;
		while (i <= n * 2 - 1) {
			if (i != n) {
				j = 1;
				while (j <= n) {
					if (j == n)
						System.out.print("*");
					System.out.print(" ");
					j++;
				}
			} else {
				j = 1;
				while (j <= n * 2 - 1) {
					System.out.print("*");
					j++;
				}
			}
			System.out.println();
			i++;
		}
	}

	public static void equilateral_Triangle(int no) {
		int lim = no * 2 - 1;
		int k = 1;
		for (int i = 1; i <= lim; i++) {

			for (int j = 1; j <= k; j++) {

				System.out.print("*");
			}
			if (i < no) {
				k++;
			} else {
				k--;
			}
			System.out.println();
		}
	}

	public static void equilateral_Triangle2(int n) {

		for (int i = 1; i < 2 * n; i++) {

			int col = i > n ? 2 * n - i : i;

			for (int j = 1; j <= col; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void hexaGonalpattern1(int length) throws InterruptedException {

		int row = length * 2 - 1;
		int col = length + (length - 1) * 3;
		int temp1 = length;
		int temp2 = 2;
		int temp3 = length + ((length - 1) * 2);
		int lim = temp3;
		int temp4 = col - 1;

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {

				if ((i <= length && j == temp1) || (i > length && j == temp4)) {
					System.out.print("/");
				} else if ((i > length && j == temp2) || (i <= length && j == temp3)) {
					System.out.print("\\");
				} else if ((i == 1 || i == row) && (j > length && j < lim)
						&& ((length % 2 == 0 && j % 2 == 0) || (length % 2 != 0 && j % 2 != 0))) {

					System.out.print("-");
				} else {
					System.out.print(" ");
				}
				Thread.sleep(5);
			}
			if (i <= length) {
				temp1--;
				temp3++;
			} else {
				temp2++;
				temp4--;
			}

			System.out.println();
		}

	}

	public static void diamondpattern1(int len) {

		for (int i = 1; i <= len * 2 - 1; i++) {

			int col = i > len ? 2 * len - i : i;

			int space = len - col;

			for (int k = 1; k <= space; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= col; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void snakePattern1(int len, int lim) {

		for (int k = 1; k <= lim; k++) {
			int temp = len / 2;

			for (int i = 1; i <= len; i++) {
				for (int j = 1; j <= len / 2; j++) {
					if ((i <= len / 2 && i == j) || (i > len / 2 && j == temp)) {
						System.out.print("* *");
					} else {
						System.out.print(" ");
					}
				}
				if (i > len / 2) {
					temp--;
				}
				System.out.println();
			}
		}
	}

	public static void numberSnakePattern(int size) {

		int temp = 1;
		for (int i = 1; i <= size; i++) {

			if (i % 2 != 0) {
				System.out.println(temp + " ," + (temp + 1));
			} else {
				System.out.println((temp + 1) + " ," + temp);
			}

			temp += 2;
		}
	}

	public static void oneAndZeroesPattern(int row) {

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0 && j % 2 == 0) {

					System.out.print("1");
				} else if (i % 2 != 0 && j % 2 != 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

	public static void oneZeroPyramidPattern(int row) {

		int col = row;

		for (int i = 1; i <= row; i++) {
			int k = i;
			for (int j = 1; j <= col; j++) {

				if (k <= row - 1) {
					System.out.print("-");
				} else if (row % 2 != 0) {
					if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {
						System.out.print("1");
					} else {
						System.out.print("0");
					}
				} else {

					if ((i % 2 != 0 && j % 2 == 0) || (i % 2 == 0 && j % 2 != 0)) {
						System.out.print("1");
					} else {
						System.out.print("0");
					}

				}
				k++;
			}
			col++;
			System.out.println();
		}
	}

	public static void eightpattern(int no) {

		int row = no * 2 + 1;
		int midd = no + 1;

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				if (((i == 1 || i == midd || i == row) && j % 2 == 0)) {
					System.out.print("*");
				} else if ((i != 1 && i != midd && i != row) && (j == 1 || j == row)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void hollowRhombus(int n) {

		for (int i = 1; i <= n; i++) { // n=5
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n || j == n)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

	public static void butterflyPattern(int n) {

		int row = n * 2;
		int col = n * 2 - 1;
		int temp1 = col;
		int midindex = n;
		int temp2 = n;
		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= col; j++) {
				if ((i <= n && (j <= i || j >= temp1)) || (i >= n + 1 && (j <= midindex || j >= temp2))) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}

			if (i <= n) {
				temp1--;
			} else {
				midindex--;
				temp2++;
			}
			System.out.println();

		}
	}

	public static void dreamteam() {

		int[] contfee = { 17, 27, 35, 77, 125, 230, 387, 777, 1547, 3850 };
		String[] matchres = new String[10];
		matchres[0] = "loose"; // -17
		matchres[1] = "win"; // 70-27
		matchres[2] = "loose";// -27
		matchres[3] = "loose";// -35
		matchres[4] = "win";
		matchres[5] = "loose"; // -35
		matchres[6] = "win"; // 200 -77
		matchres[7] = "loose"; // -35
		matchres[8] = "win"; // 200-77
		matchres[9] = "loose"; // -125

		int sum = -17 + 43 - 27 - 35 + 123 - 35 + 123 - 35 + 123 - 125;
		System.out.println(sum);
		int returns = 0;
		int loss = 0;
		int n = contfee[0];
		for (int i = 0; i < matchres.length; i++) {

			String res = matchres[i];
			if (res.equals("win")) {

				switch (n) {
				case 17 -> returns = returns + (44 - 17);
				case 27 -> returns = returns + (70 - 27);
				case 35 -> returns = returns + (90 - 35);
				case 77 -> returns = returns + (200 - 77);
				case 125 -> returns = returns + (300 - 125);
				case 230 -> returns = returns + (600 - 230);
				case 387 -> returns = returns + (1000 - 387);
				case 777 -> returns = returns + (2000 - 777);
				case 1547 -> returns = returns + (4000 - 1547);
				case 3850 -> returns = returns + (10000 - 3850);
				default -> {
					System.out.println(" invalid ");
				}
				}
				;
				if (i != 0) {
					n = contfee[i - 1];
				}
			} else if (res.equals("loose")) {

				switch (n) {
				case 17 -> loss = loss + 17;

				case 27 -> loss = loss + 27;
				case 35 -> loss = loss + 35;
				case 77 -> loss = loss + 77;
				case 125 -> loss = loss + 125;
				case 230 -> loss = loss + 230;
				case 387 -> loss = loss + 387;
				case 777 -> loss = loss + 777;
				case 1547 -> loss = loss + 1547;
				case 3850 -> loss = loss + 3850;
				default -> {
					System.out.println(" invalid ");
				}
				}
				;
				n = contfee[i];
			}
		}
		System.out.println("returns is:- " + returns + " My loss is :- " + loss);
		int TotalProfit = returns - loss;
		System.out.println("My total profit or loss in all games is :- " + TotalProfit);
	}

	public static void stringPalindromePattern(String name) {
		for (int i = 0; i < name.length(); i++) {
			int space = name.length() - i;
			for (int s = 0; s < space; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(name.charAt(j));
			}
			for (int k = i - 1; k >= 0; k--) {
				System.out.print(name.charAt(k));
			}
			System.out.println();
		}
	}

	public static void palindromestringPattern(String s) {
		for (int i = 1; i <= s.length(); i++) {
			for (int k = s.length() - 1; k >= i; k--) {
				System.out.print(" ");
			}

			System.out.println(s.substring(0, i) + new StringBuilder(s.substring(0, i - 1)).reverse());

		}
	}

	public static By replaceXXXXFromString(By by, String yearmonth, String date) {

		String s = by.toString().substring(by.toString().indexOf(":") + 2).replace("X1", yearmonth).replace("X2", date);

		System.out.println(s.length());
		System.out.println(s);
		return By.xpath(s);

	}

	public static void rotateStringcharPattern(String str) {

		char[] c = str.toCharArray();
		int m = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			for (int k = m; k > 0; k--) {

				System.out.print(c[k]);

			}
			for (int j = 0; j <= i; j++) {

				System.out.print(c[j]);
			}
			m++;
			System.out.println("");
		}
	}

	public static void stringCharpatternHollowSquare(String s) {

		int rows = s.length();
		int m = 0;
		for (int i = rows - 1; i >= 0; i--) {

			for (int j = m; j > 0; j--) {
				if (i == 0 || i == rows - 1 || j == m) {
					System.out.print(s.charAt(j) + " ");
				} else {
					System.out.print("  ");
				}

			}

			for (int k = 0; k <= i; k++) {
				if (i == 0 || i == rows - 1 || k == i) {
					System.out.print(s.charAt(k) + " ");
				} else {
					System.out.print(" ");
				}

			}
			m++;
			System.out.println();
		}
	}
//	static By emailBY =    By.xpath("//input[@id='email' ]");
//	static By passwordBy =  By.xpath("//input[@id='pass' ]");
//	static By logInBtnBy =  By.xpath("//input[@value='Log In']");
//	static By cancelBtnBy =  By.xpath("//span[text()='Cancel']");
//	static By regbutton=By.xpath("//a[text()='Create New Account']");
//
//	static By firstname=By.xpath("//input[@id='u_9_b_Tl']");

//	static By departure=By.xpath("//div[contains(@data-testid,'X1')]//div[contains(@data-testid,'X2')]");

	public static int binarytoDecimal(String binaryno) {

		int dec = 0;
		int ind = 0;
		for (int i = binaryno.length() - 1; i >= 0; i--) {
			int pow = (int) Math.pow(2, i);
			int ch = Integer.parseInt(binaryno.charAt(ind) + "");
			dec = dec + pow * ch;
			ind++;
		}

		return dec;

	}

	public String decToBinary(int no) {

		StringBuilder st = new StringBuilder();
		while (no > 0) {
			int rem = no % 2;
			no = no / 2;
			st.append(rem);
		}
		return st.reverse().toString();
	}

	public static void stringHollowSquareBykavita(String str) {

		int n = str.length() - 1;

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0) {
					System.out.print(str.charAt(j) + " ");

				} else if (i == n) {
					System.out.print(str.charAt(str.length() - 1 - j) + " ");
				} else if (j == 0) {
					System.out.print(str.charAt(i) + " ");
				} else if (j == n) {
					System.out.print(str.charAt(str.length() - 1 - i) + " ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

	public static Map<Integer, List<String>> separateStringbylength(String str) {
		String[] arr = str.split(" ");

		Map<Integer, List<String>> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			Integer count = arr[i].length();

			if (!map.containsKey(count)) {
				List<String> s = new ArrayList<>();
				s.add(arr[i]);
				map.put(count, s);
			} else {
				List<String> s = map.get(count);
				s.add(arr[i]);

			}

		}
		return map;
	}

	public static void assendingOrder() {

		String str = "My name is Jayesh and I am working as an automation engineer";
		String[] splittedStr = str.split(" ");
		int highstLength = 0, temp = 0;
		for (int i = 0; i < splittedStr.length; i++) {
			temp = splittedStr[i].length();

			if (temp > highstLength) {
				highstLength = temp;
			}
		} // for loop for finding highest length
		for (int i = 0; i <= highstLength; i++) {
			int flag = 0;
			for (int j = 0; j <= highstLength; j++) {

				if (splittedStr[j].length() == i) {
					System.out.print(splittedStr[j] + " ");
					flag++;
				}
			} // inner for loop
			if (flag != 0) {
				System.out.println();
			}
		} // removing extra line

	}// outer for loop

	public static void main(String[] args) throws InterruptedException, AWTException {

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

//		String str = "My name is Jayesh and I am working as an automation engineer";
//		Map<Integer, List<String>> list = separateStringbylength(str);
//
//		for (Map.Entry<Integer, List<String>> map : list.entrySet()) {
//			System.out.println(map.getKey() + " " + map.getValue());
//		}

		// stringPalindromePattern("Jayesh");
//	BaseTest.launchBrowser("chrome");
//	WebDriver driver=BaseTest.driver;
//
//	driver.get("https://the-internet.herokuapp.com/basic_auth");
////	String username="admin";
////	String password="admin";
////	String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
////
////	driver.get(URL);
//	Thread.sleep(3000);
//
//	Thread.sleep(3000);
////	BaseTest.closeDriver();
//	Robot r=new Robot();
//
//	r.keyPress(KeyEvent.VK_A);
//	r.keyRelease(KeyEvent.VK_A);
//
//	r.keyPress(KeyEvent.VK_D);
//	r.keyRelease(KeyEvent.VK_D);
//
//	r.keyPress(KeyEvent.VK_M);
//	r.keyRelease(KeyEvent.VK_M);
//
//	r.keyPress(KeyEvent.VK_I);
//	r.keyRelease(KeyEvent.VK_I);
//
//	r.keyPress(KeyEvent.VK_N);
//	r.keyRelease(KeyEvent.VK_N);
//
//	r.keyPress(KeyEvent.VK_TAB);
//	r.keyRelease(KeyEvent.VK_TAB);
//
//	r.keyPress(KeyEvent.VK_A);
//	r.keyRelease(KeyEvent.VK_A);
//
//	r.keyPress(KeyEvent.VK_D);
//	r.keyRelease(KeyEvent.VK_D);
//
//	r.keyPress(KeyEvent.VK_M);
//	r.keyRelease(KeyEvent.VK_M);
//
//	r.keyPress(KeyEvent.VK_I);
//	r.keyRelease(KeyEvent.VK_I);
//
//	r.keyPress(KeyEvent.VK_N);
//	r.keyRelease(KeyEvent.VK_N);
//
//	r.keyPress(KeyEvent.VK_TAB);
//	r.keyRelease(KeyEvent.VK_TAB);
//
//
//
//	Thread.sleep(1000);
//
//	r.keyPress(KeyEvent.VK_ENTER);
//
//
//
//	Thread.sleep(2000);
// String title = driver.getTitle();
//
//	System.out.println("The page title is "+title);
//
//	Thread.sleep(2000);
//	BaseTest.closeDriver();

//	 String str="My name is Jayesh and I am working as an automation engineer";
//
//	//  System.out.println("Given length | Strings");
//	 for(Map.Entry<Integer,List<String>> m: separateStringbylength(str).entrySet()){
//		 System.out.println(m.getKey()+" "+m.getValue());
//	 }
//	 for(int k=0;k<list.size();k++) {
//		System.out.println(Arrays.toString(list.get(k)));
//	 }
//		String str=" r  ";
//
//		if(str.isEmpty()){
//			System.out.println("empty");
//		}
//		if(str.isBlank()) {
//			System.out.println("blank");
//		}
//		String str = "  India     Is My    Country";
//        StringBuilder st=new StringBuilder();
//
//       String[] arr=str.split(" ");
//       String newstr="";
//
//		for(int i=0;i<arr.length;i++) {
//			if(!arr[i].isEmpty()) {
//				newstr=newstr+arr[i]+" ";
//			}
//		}
//		System.out.println(newstr);
//		for(int i=0;i<5;i++){
//	          char c='A';
//	          for(int j=i;j<5;j++){
//	              System.out.print(" ");
//	          }
//	          for(int k=0;k<=i;k++){
//	              System.out.print(c+" ");
//	              c++;
//	          }
//	          System.out.println();
//	      }

//		String str="Jayesh" ;
//	char[] c=str.toCharArray();
//	for(int i=str.length()-1;i>=0;i--)
//	{
//
//		for(int j=0;j<=i;j++)
//		{
//		System.out.print(c[j]);
//		 }
//		System.out.println();
//	}

//		String a[]= {"1","3","6","8","9"};
//		String b[]= {"11","13","26","18","39"};
//		String c[]= {"12","23","16","28","19"};
//		String arr[][]=new String[3][4];
//
//		arr[0]=a;
//		arr[1]=b;
//		List<String []> list=new ArrayList<>();
//
//		list.add(a);
//		list.add(b);
//		list.add(c);
//		int [] ele=new int[list.size()];
//
//		for(int i=0;i<3;i++) {
//
////			int d[]=new int[a.length];
////			for(int j=0;j<d.length;j++) {
////				d[j]=Integer.parseInt(list.get(i)[j]);
////			}
//
//			Arrays.sort(list.get(i));
//			//ele[i]=d[d.length-1];
//			System.out.println(list.get(i)[list.get(i).length-1]);
//		}
//

//		String date="15aug1947gljlg45";
//
//		List<String> list=new ArrayList<>();
//		StringBuilder str=new StringBuilder();
//		int sum=0;
//		for(int i=0;i<date.length();i++) {
//
//			if(Character.isDigit(date.charAt(i))) {
//				str.append(date.charAt(i));
//				if(i==date.length()-1 || !Character.isDigit(date.charAt(i+1))) {
//					list.add(str.toString());
//					str.delete(0, str.length());
//				}
//			}else {
//				continue;
//			}
//
//		}
//
//		for(int j=0;j<list.size();j++) {
//			sum=sum+Integer.parseInt(list.get(j));
//		}
//
//		System.out.println(sum);

		// WebDriver driver=BaseTest.driver;

//		BaseTest.launchBrowser("chrome");
//		WebDriver driver=BaseTest.driver;
//		ChromeDriver r;
//		driver.get("https://www.spicejet.com");
//
//		driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
//
//		By by=replaceXXXXFromString(departure,"February-2023","14");
//
//		//By depar=By.xpath("//div[contains(@data-testid,'February-2023')]//div[contains(@data-testid,'14')]");
//		driver.findElement(by).click();
//
//		Thread.sleep(3000);
//		BaseTest.closeDriver();

//		String s="aabdlagljoha";
//		System.out.println(s.length());
//		System.out.println(s.indexOf('b'));
//		System.out.println(s.lastIndexOf('b'));

//	   Map<Integer,Integer> cont=new HashMap<>();
//	   cont.put(12, 40);
//	   cont.put(19, 66);
//	   cont.put(49, 170);
//	   cont.put(89, 300);
//	   cont.put(179, 600);
//	   cont.put(299, 1000);
//	   cont.put(525, 1800);
//	   cont.put(899, 3000);
//	   cont.put(1499,5000);
//	   cont.put(1799, 6000);
//	   cont.put(2999, 10000);

//		Jayesh
//		 Jayes
//		  Jaye
//		   Jay
//		    Ja
//		     J

//		J a y e s h
//		a         s
//		y         e
//		e         y
//		s         a
//		h s e y a J

//	Jayesh
//	aJayes
//	yaJaye
//	eyaJay
//	seyaJa
//  hseyaJ

//		   J
//		  JAJ
//		 JAYAJ
//		JAYEYAJ
//	   JAYESEYAJ
//	  JAYESHSEYAJ

//		*---*
//		**-**
//		*****
//		*****
//		**-**
//		*---*

//      -*-*-*-*-
//      *       *
//      *       *
//      *       *
//      -*-*-*-*-
//      *       *
//      *       *
//      *       *
//      -*-*-*-*-

//		   1
//		  101
//		 10101
//		1010101

		// * * *
		// * *
		// * *
		// * * *
		// * *
		// * *
		// * * *

		// * *
		// * *
		// * *
		// * *
		// * *

		// 1
		// 0 1
		// 1 0 1
		// 0 1 0 1

		// * * *
		// ** **
		// *** **
		// * * *
		// 1 2 3
		// 8 9 4
		// 7 6 5

		// * * * * *
		// * * * *
		// * * * ** *
		// * * * *
		// * *** * * *
		// * * **
		// * * * * *
		//

		// 1,2
		//
		// 4,3
		//
		// 5,6
		//
		// 8,7
		//
		// 9,10
		//
		// 12,11
		//
		// 13,14
		//
		// 16,15
		//
		// 17,18
		//
		// 20,19

		// switch (no) {
		// case 1:
		// System.out.println("1");
		// break;
		//
		// case 2:
		// System.out.println("2");
		// break;
		//
		// case 5:
		// System.out.println("5");
		// break;
		//
		// default:
		// System.out.println("Default");
		// break;
		// }

		// J
//		  JAJ
//		 JAYAJ
//		JAYEYAJ
//	     JAYESEYAJ
//	  JAYESHSEYAJ

		// ** ***
		// * * * *
		// ** * *
		// * * ***
		// ** * *
		// * *
		// ***
		// *--
		// -*-
		// --*
		// --*
		// -*-
		// *--

		// *
		// *
		// *
		// *
		// *
		// *
		// *
		// *
		// *
		// *
		// *
		// *
		// *
		// *
		// *

		// ||
		// (**)
		// * *
		// * *
		// * *
		// * *
		// * *
		// * *
		// * *
		// * *
		// * *
		// * *
		// * *
		// * *
		// * *
		// * *
		// * *

		// ----*
		// ---* *
		// --* * *
		// -* * * *
		// * * * * *

		// ----*-*-*-*-*----

		// ---*-*-*-*---
		// --*-------*--
		// -*---------*-
		// *-----------*
		// -*---------*-
		// --*-------*--
		// ---* * * *---
		//
		// --*-*-*--
		// -* *-
		// * *
		// -* *-
		// --*-*-*--
		// -*-*-
		// * * *
		// * *
		////
		// -*-
		// *-*
		// -*-
		// *------
		// -*-----
		// --*-*-*
		// *
		// * * *
		// *
		// * * *

		// * * * * *
		// * * *
		// * * * * *
		// * * *
		// * * * * *

		// String str="* * * * *\r\n"
		// + " * * * *\r\n"
		// + " * * *\r\n"
		// + " * * * *\r\n"
		// + " * * * * *";
		// System.out.println(str);
		// String str1=str.replace("*","/");
		// System.out.println(str1);

		// _ _ _ _ _
		// | |
		// | |
		// | |
		// | |
		// |_ _ _ _ _|
		//
		// * * * * *
		// * * * *
		// * * *
		// * * * *
		// * * * * *

		// 1
		// 2 6
		// 3 7 10
		// 4 8 11 13
		// 5 9 12 14 15

		// 1 1 1 1 1 1 1
		// 1 1 1 1 1 2 2
		// 1 1 1 1 3 3 3
		// 1 1 1 4 4 4 4
		// 1 1 5 5 5 5 5
		// 1 6 6 6 6 6 6
		// 7 7 7 7 7 7 7

		// 1 2 3 4 5 6 7
		// 2 3 4 5 6 7
		// 3 4 5 6 7
		// 4 5 6 7
		// 5 6 7
		// 6 7
		// 7
		// 6 7
		// 5 6 7
		// 4 5 6 7
		// 3 4 5 6 7
		// 2 3 4 5 6 7
		// 1 2 3 4 5 6 7

		// A
		// AB
		// ABC
		// ABCD
		// ABCDE

		// /\
		// \/
		// ( )
		// )(
		// /||\
		// / || \
		// / || \
		// / || \
		// \___||___/

		// * * * * * * * *
		// * * * * *
		// * * * * *
		// * *
		// *
		// *
		// *
		// *
		// *

		// * * *
		// * *
		// * * * * *
		// * *
		// * * *

	}

}
