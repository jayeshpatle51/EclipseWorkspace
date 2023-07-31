package Generic_methods;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patternclass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
	}

}
