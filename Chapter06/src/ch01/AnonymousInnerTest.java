package ch01;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 10;
		
		return new Runnable(){	// 클래스 이름을 굳이 사용할 필요가 없어서 바로 return
			
			int localNum = 1000;
			@Override
			public void run() {
//				num = 200;  // 에러 남. 지역변수는 상수로 바뀜
//				i = 100;    // 에러 남. 매개 변수 역시 지역변수처럼 상수로 바뀜
							// getRunnable() 메서드가 호출되는 시점과 
							// MyRunnable 클래스의 생성 주기가 달라서 그렇다.
							// run()이라는 메서드는 getRunnable()을 받고 나면
							// 나중에 또 호출될 수 있는 여지가 있을 수 있다. 
							// 그래서 i와 num을 컴파일러가 final로 잡고 
							// 스택이 아닌 상수 영역에 저장한다.
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + " (외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sNum = " + Outer2.sNum + " (외부 클래스 정적 변수)");
				// 바로 위에 두 명령에 있는 변수는 이 메서드가 실행하려면 
				// 이 메서드를 포함한 Outer2 클래스가 먼저 만들어져야 함으로 에러가 생기지 않는다. 
			}
		};
			
	}
	
	Runnable runnable = new Runnable() { 
		// Outer2 클래스의 인스턴스 변수 runnable
		
		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 변수");
		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {

		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		
		runner.run();
		
		out.runnable.run();
	}

}
