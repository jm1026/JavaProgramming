package ch01;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 10;
		
		return new Runnable(){	// Ŭ���� �̸��� ���� ����� �ʿ䰡 ��� �ٷ� return
			
			int localNum = 1000;
			@Override
			public void run() {
//				num = 200;  // ���� ��. ���������� ����� �ٲ�
//				i = 100;    // ���� ��. �Ű� ���� ���� ��������ó�� ����� �ٲ�
							// getRunnable() �޼��尡 ȣ��Ǵ� ������ 
							// MyRunnable Ŭ������ ���� �ֱⰡ �޶� �׷���.
							// run()�̶�� �޼���� getRunnable()�� �ް� ����
							// ���߿� �� ȣ��� �� �ִ� ������ ���� �� �ִ�. 
							// �׷��� i�� num�� �����Ϸ��� final�� ��� 
							// ������ �ƴ� ��� ������ �����Ѵ�.
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + " (�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outer.sNum = " + Outer2.sNum + " (�ܺ� Ŭ���� ���� ����)");
				// �ٷ� ���� �� ��ɿ� �ִ� ������ �� �޼��尡 �����Ϸ��� 
				// �� �޼��带 ������ Outer2 Ŭ������ ���� ��������� ������ ������ ������ �ʴ´�. 
			}
		};
			
	}
	
	Runnable runnable = new Runnable() { 
		// Outer2 Ŭ������ �ν��Ͻ� ���� runnable
		
		@Override
		public void run() {
			System.out.println("Runnable �� ������ �͸� Ŭ���� ����");
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
