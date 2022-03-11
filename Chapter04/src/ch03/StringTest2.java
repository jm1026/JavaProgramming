package ch03;

public class StringTest2 {

	public static void main(String[] args) {
		String str1 = "Simple String";
		String str2 = "Simple String";
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);

	}

}
