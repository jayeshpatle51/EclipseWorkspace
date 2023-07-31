package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BinaryAsceOrder {

	public static String decimalToBinary(int num) {

		return Integer.toBinaryString(num);
	}

	public static void main(String[] args) {

		int[] arr = { 5, 8, 9, 12, 4, 3 };


		int[] newarr = new int[arr.length];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {

			String str = Integer.toBinaryString(arr[i]);
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '1') {
					count++;
				}
			}
			map.put(arr[i], count);
		}

		Collection<Integer> col = map.values();
		List<Integer> list = new ArrayList<>(col);
		Collections.sort(list);
		int ind = 0;

		for (int k = 0; k < list.size(); k++) {
			for (Entry<Integer, Integer> entry : map.entrySet()) {

				if (list.get(k).equals(entry.getValue())) {
					newarr[ind] = entry.getKey();
					entry.setValue(-1);
					break;
				}
			}
			ind++;

		}

		System.out.println(Arrays.toString(newarr));
	}

}
