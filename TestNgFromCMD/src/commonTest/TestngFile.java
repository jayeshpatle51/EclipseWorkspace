package commonTest;

import org.testng.annotations.Test;

public class TestngFile {

	@Test
	public void testMethod1() {

		System.out.println("TestMethod1 is executed");
	}

	@Test
	public void testMethod2() {
		// num=3456453883468438;
		// output=3456-4538-8346-8438
		//
		// String num = "3456453883468438";
		// String output = "";
		// for (int i = 0; i < num.length(); i++) {
		// if ((i != 0) && i % 4 == 0) {
		// output = output + "-";
		// }
		// output = output + num.charAt(i);
		// }
		//
		// System.out.println(output);
		int[] n = { 3, 4, 6, 5, 7, 5, 7, 9, 8 };


		for (int i = 0; i < n.length; i++) {
			int count = 1;
			for (int j = i + 1; j < n.length; j++) {
				if (n[i] == n[j]) {
					count++;
				}

			}
			if (count == 1) {
				System.out.println(n[i]);
			}
		}
	}

}
