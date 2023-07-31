package javaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AscOrder2 {

	public static void intToBin2() {
		int[] arr = { 5, 8, 9, 12, 4, 3 };
		int count0 = 0, count1 = 0;
		Map<Integer, Integer> map = new HashMap<>();
		int num = 0, temp;
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			num = arr[i];
			while (num > 0) {
				temp = num % 2;
				num = num / 2;
				if (temp == 1) {
					count1++;
				} else {
					count0++;
				}
				str = temp + str;
			}
			System.out.println("Binary no is: " + str);
			System.out.println("count of 0's is :" + count0);
			System.out.println("count of 1's is :" + count1);
			map.put(arr[i], count1);
			str = "";
			count0 = 0;
			count1 = 0;
		}
		System.out.println(map);
		List<Entry<Integer, Integer>> nlist = new ArrayList<>(map.entrySet());
		nlist.sort(Entry.comparingByValue());
		System.out.println(nlist);
		for (Entry<Integer, Integer> i : nlist) {
			System.out.print(i.getKey() + " ");
		}
	}

	public static void main(String[] args) {
		intToBin2();
	}
}
