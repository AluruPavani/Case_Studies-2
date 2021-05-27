
import java.util.HashSet;

public class CommonSubString {

	public static String twoStrings(String str1, String str2) {

		HashSet<Character> string1_chars = new HashSet();
		HashSet<Character> string2_chars = new HashSet();

		for (int i = 0; i < str1.length(); i++) {
			string1_chars.add(str1.charAt(i));
		}
		for (int i = 0; i < str2.length(); i++) {
			string2_chars.add(str2.charAt(i));
		}
		string1_chars.retainAll(string2_chars);
		if (!string1_chars.isEmpty()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		return null;

	}

	public static void main(String[] args) {

		String string1 = "Hello", string2 = "Hi";

		twoStrings(str1, str2);

	}

}
