


public class CommonSubString {

	

	public static void main(String[] args) {

		String a[] = { "km", "mn", "op" };

		String b[] = { "kl", "uv", "ol" };
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j <= a.length - 2; j++) {
				char[] a1 = a[i].toCharArray();

				char[] b1 = b[i].toCharArray();

				if (a1[j] == (b1[j])) {
					System.out.println("YES." + "\t" + "The common substring is: " + a1[j]);
				} else {
					System.out.println("NO");
				}
			}
		}


	}

}
