
import java.util.LinkedHashSet;

import java.util.Scanner;

class InvalidStringException extends Exception {
	public InvalidStringException(String str) {

		super(str);
	}
}

public class StringValidation {
	static void validate(String str) throws InvalidStringException {
		LinkedHashSet<String> uniqueStrings = new LinkedHashSet<>();
		if (uniqueStrings.contains(str))
			throw new InvalidStringException("not valid");
		else
			uniqueStrings.add(str);
	}

	public static void main(String[] args) {

		LinkedHashSet<String> uniqueStrings = new LinkedHashSet<>();
		String str;
		Scanner scnr = new Scanner(System.in);

		try {
			validate("stringes");
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}

		while (true) {
			System.out.println("Enter a String: ");
			str = scnr.nextLine();
			if (str.length() == 8 && str != " " && !(str.contains("/^[a-zA-Z ]+$/"))) {
				uniqueStrings.add(str);
			} else {
				System.out.println("Please Enter Valid String");
			}

			System.out.println(uniqueStrings);
		}

	}
}
