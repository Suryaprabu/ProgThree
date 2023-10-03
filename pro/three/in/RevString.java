package pro.three.in;

public class RevString {
	public static void main(String[] args) {
		String s ="oppo";
		String rev ="";
		String temp =s;
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev+s.charAt(i);

		}
		System.out.println(rev);
        System.out.println(temp);
		if (rev.equals(temp)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
