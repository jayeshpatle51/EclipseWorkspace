package seleniumscripts;

import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String password = scanner.nextLine();

		if (isValidPassword(password)) {
			System.out.println("Valid password!");
		} else {
			System.out.println("Invalid password!");
		}
	}

	public static boolean isValidPassword(String password) {
		// Check password length
		if (password.length() < 8 && password.length() > 20) {
			return false;
		}

		// Check for at least one uppercase letter
		if (!password.matches(".*[A-Z].*")) {
			System.out.println("Uppercase Character is not present in password");
			return false;
		}

		// Check for at least one lowercase letter
		if (!password.matches(".*[a-z].*")) {
			System.out.println("Lowercase Character is not present in password");
			return false;
		}

		// Check for at least one digit
		if (!password.matches(".*\\d.*")) {
			System.out.println("Digit  not present in password");
			return false;
		}

		// Check for at least one special character
		if (!password.matches(".*[!@#$%^&*()].*")) {
			System.out.println("Special Character is not present in password");
			return false;
		}

		if (password.matches(".*\\s.*")) {
			System.out.println("Spaces should not  present in password");
			return false;
		}
		// All checks passed, password is valid
		return true;
	}
}
