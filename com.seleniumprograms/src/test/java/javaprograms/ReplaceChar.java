package javaprograms;

public class ReplaceChar {

	public static void main(String[] args) {

//	  --purple: #6f42c1;
//	  --pink: #e83e8c;
//	  --red: #dc3545;
//	  --orange: #fd7e14;
//	  --yellow: #ffc107;
//	  --green: #28a745;
//	  --teal: #20c997;
//	  --cyan: #17a2b8;
//	  --white: #fff;
//	  --gray: #6c757d;
//	  --gray-dark: #343a40;
//	  --primary: #007bff;
//	  --secondary: #6c757d;
//	  --success: #28a745;
//	  --info: #17a2b8;
//	  --warning: #ffc107;
//	  --danger: #dc3545;
//	  --light: #f8f9fa;
//	  --dark: #343a40;

		String str = "--purple: #6f42c1;\r\n" + "	  --pink: #e83e8c;\r\n" + "	  --red: #dc3545;\r\n"
				+ "	  --orange: #fd7e14;\r\n" + "	  --yellow: #ffc107;\r\n" + "	  --green: #28a745;\r\n"
				+ "	  --teal: #20c997;\r\n" + "	  --cyan: #17a2b8;\r\n" + "	  --white: #fff;\r\n"
				+ "	  --gray: #6c757d;\r\n" + "	  --gray-dark: #343a40;\r\n" + "	  --primary: #007bff;\r\n"
				+ "	  --secondary: #6c757d;\r\n" + "	  --success: #28a745;\r\n" + "	  --info: #17a2b8;\r\n"
				+ "	  --warning: #ffc107;\r\n" + "	  --danger: #dc3545;\r\n" + "	  --light: #f8f9fa;\r\n"
				+ "	  --dark: #343a40;";

		str = str.replace("--", "").replace(": ", "(\"").replace(";", "\"),;");

		String[] arr = str.split(";");

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

	}

}
