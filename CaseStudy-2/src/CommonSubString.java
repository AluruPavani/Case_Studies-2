
import java.util.HashSet;

public class CommonSubString {

	public static String twoStrings(String s1, String s2) {

		HashSet<Character> string1_chars = new HashSet();
		HashSet<Character> string2_chars = new HashSet();

		for (int i = 0; i < s1.length(); i++) {
			string1_chars.add(s1.charAt(i));
		}
		for (int i = 0; i < s2.length(); i++) {
			string2_chars.add(s2.charAt(i));
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

		String s1 = "Hello", s2 = "Hi";

		twoStrings(s1, s2);

	}

}
