package string_practice;

public class StringOpertaions {

		public static void main(String[] args)
		{
			String s = "India";
			String a="Great";
			//s.concat(hi); // Can not do this on strings! Thats the reason
							//we go to String Buffer and String Builder
			
			System.out.println(s);
			System.out.println(a);
			
			System.out.println(s.toUpperCase());
			System.out.println(a.toLowerCase());
			System.out.println(s.concat(a));
			
			StringBuffer sb=new StringBuffer("Hello");
			sb.append("world");  //We can directly manipulate the string 
			System.out.println(sb);
			sb.length();
			System.out.println(sb);
			sb.replace(1, 3, "hai");
			System.out.println(sb);
			sb.reverse();
			System.out.println(sb);
			
			StringBuilder sb1=new StringBuilder("Kaushik");
			sb1.append("Fuck");  //We can directly manipulate the string 
			System.out.println(sb1);
			sb1.length();
			System.out.println(sb1);
			sb1.replace(1, 3, "ASS");
			System.out.println(sb1);
			sb1.reverse();
			System.out.println(sb1);
	}

	

}
