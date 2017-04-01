package string_practice;

public class StringConstructors {
	public static void main(String[] args) {

		char Char[] = { 'N', 'A', 'N', 'I' };
		String string = new String(Char);

		char Char1[] = { 'N', 'A', 'N', 'I' };

		String string1 = new String(Char, 0, 2);

		System.out.println(string);
		System.out.println(string1);
		// construct a String object that contains the same character sequence
		// as another
		// String object using this constructor:
		String string2 = new String(Char1);
		String string3 = new String(string2);
		System.out.println(string2);
		System.out.println(string3);
		System.out.println(string3.length());
		byte ascii[] = { 80, 82, 65, 68, 69, 69, 80 };
		String string4 = new String(ascii, 0, 7);


		System.out.println(string4);
//Concatination
		String s = "four: " + 2 + 2;
		System.out.println(s);	}
}