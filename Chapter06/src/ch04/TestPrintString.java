package ch04;

public class TestPrintString {

	public static void main(String[] args) {

		PrintString lambdaStr = s->System.out.println(s);
		lambdaStr.showString("hello lambda_1");
		System.out.println();
		
		showMyString(lambdaStr);
		System.out.println();
		
		PrintString reStr = returnString();
		reStr.showString("hello ");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("Hello lambda_2");
	}
	
	public static PrintString returnString() {
		return s->System.out.println(s + "world");
	}

}
