package practiceprograms;

public class ConvertTouppercase {

	public static void main(String[] args) {

//		String str = "make selenium easy ";
//		String newstr = "";
//
//		String[] arr = str.split(" ");
//
//		for (int i = 0; i < arr.length; i++) {
//
//			String s = arr[i];
//			arr[i] = Character.toUpperCase(s.charAt(0)) + s.substring(1);
//			newstr = newstr + arr[i] + " ";
//		}
//		// output:Make Selenium Easy
//		System.out.println(newstr);

		String str = "$123.45 is the full amount charged for the user 2";

		String[] arr = str.split(" ");
		String output = "";
		for (int i = 0; i < arr.length; i++) {

			if (arr[i].contains("$")) {
				for (int k = 0; k < arr[i].length(); k++) {
					if (arr[i].charAt(k) != '$') {
						output = output + arr[i].charAt(k);
					}
				}
			}

		}
		System.out.println(output);

		System.out.println(str.split("is")[0].replaceAll("[^0-9 .]", ""));

	}

}
