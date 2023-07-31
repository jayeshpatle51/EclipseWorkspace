package javaprograms;

public class JavaStreams {

	public static void main(String[] args) {

		// List<String> namelist = new ArrayList<>();
		//
		// namelist.addAll(Arrays.asList("Jayesh", "Yashmant", "Srikar", "Venkatesh",
		// "Vasant"));
		//
		// namelist.stream().forEach(System.out::println);
		//
		// Stream<?> st;
		// 1234
		// 2341
		// 3412
		// 4123

		int[] arr = { 1, 2, 3, 4 };
		int count = 1;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] != arr[j]) {


					for (int k = 0; k < arr.length; k++) {

						if (arr[i] != arr[k] && arr[j] != arr[k]) {
							for (int l = 0; l < arr.length; l++) {
								if (arr[i] != arr[l] && arr[k] != arr[l] && arr[j] != arr[l]) {
									System.out.println(count++ + ") " + arr[i] + arr[j] + arr[k] + arr[l]);
									break;
								}
							}
							break;
						}

					}
					break;
				}
			}
		}

	}

}
//1234
//1243
//1324
//1342
//1423
//1432
//2134
//2143
//2314
//2341
//2413
//2431
//3124
//3142
//3214
//3241
//3412
//3421
//4123
//4132
//4213
//4231
//4312
//4321
