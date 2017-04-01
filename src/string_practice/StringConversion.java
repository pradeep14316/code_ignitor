package string_practice;

public class StringConversion {
	public static void main(String[] args) {
		String c = new String("i am pradeep reddy vangalaa ");
		char a = c.charAt(5);
		String b = new String("i am pradeep reddy vangala ");
		System.out.println(a);
		int result = c.compareTo(b);
		System.out.println(result);

	}
}
