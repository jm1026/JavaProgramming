package ch01;

class OutClass {

	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass(); // 내부 클래스 생성
	}
	
	class InClass{
		
		int inNum = 100;
//		static int sInNum = 200;  
			// InClass가 내부 클래스로서 외부 클래스인 OutClass가 먼저 생성되어야 생성할 수 있다.
			// static 변수는 OutClass 생성과 상관없이 사용 가능해야 하므로 여기선 사용하지 못한다.
		
		void inTest(){
			System.out.println("OutClass num = " + num + " (외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + inNum + " (내부 클래스의 인스턴스 변수)");
		}
		
	}
	
	public void usingClass(){
		inClass.inTest(); // 내부 클래스 변수를 사용하여 메서드 호출하기
	}
	
	static class InStaticClass{
		
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest(){   // 정적 클래스의 일반 메서드
//			num += 10;    // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
			System.out.println("InStaticClass inNum = " + inNum + " (내부 클래스의 인스턴스 변수 사용)"); 
			System.out.println("InStaticClass sInNum = " + sInNum + " (내부 클래스의 스태틱 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 스태틱 변수 사용)");
		}
		
		static void sTest(){  // 정적 클래스의 static 메서드
//			num += 10;   // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
//			inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음
			
			System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + " (내부 클래스의 스태틱 변수 사용)");
		

		}
	
	}
}
public class InnerTest {

	public static void main(String[] args) {
//		OutClass outClass = new OutClass();
//		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
//		outClass.usingClass();    // 내부 클래스 기능 호출
//	    System.out.println();
//	    
//		OutClass.InClass inClass = outClass.new InClass();   // 외부 클래스를 이용하여 내부 클래스 생성
//		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
//		inClass.inTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();  
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
		OutClass.InStaticClass.sTest();

	}

}
