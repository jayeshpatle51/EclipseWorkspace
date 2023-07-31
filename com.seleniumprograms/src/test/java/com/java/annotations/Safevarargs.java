package com.java.annotations;

import java.util.Arrays;
import java.util.List;

public class Safevarargs {

	@SafeVarargs
	private void displayList(List<String>... lists) {
		for (List<String> list : lists) {
			System.out.println(list);
		}
	}

	public static void main(String args[]) {
		Safevarargs obj = new Safevarargs();

		List<String> universityList = Arrays.asList("Tribhuvan University", "Kathmandu University");
		obj.displayList(universityList);

		List<String> programmingLanguages = Arrays.asList("Java", "C");
		obj.displayList(universityList, programmingLanguages);
	}
}

