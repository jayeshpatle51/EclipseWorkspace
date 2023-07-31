package commonTest;

import java.util.Scanner;

public class InterviewPrograms {


	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String code = sc.nextLine();

		String fincode = "";
		if (code.length() != 16 && code.matches("\\D")) {
			System.out.println("Given String number is not valid " + code);
		} else {
			int k = 4;
			for (int i = 0; i < code.length(); i++) {
				if (i == k) {
					fincode = fincode + "-";
					// i--;
					k = k + 4;
				}
				fincode = fincode + code.charAt(i);

			}
			System.out.println("The Given final String is " + fincode);
		}


	}

}



//List<List<String>> list = new ArrayList<>();
//list.add(Arrays.asList("Jayesh", "Jitendra"));
//list.add(Arrays.asList("patle", "Katre"));
//System.out.println(list);
//
//String[][] arr = new String[list.size()][];
//
//int i = 0;
//for (List<String> l : list) {
//	arr[i++] = l.toArray(new String[l.size()]);
//}
//
//System.out.println(Arrays.deepToString(arr));