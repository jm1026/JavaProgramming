package ch20;

class MyThread2 implements Runnable{
	
	public void run() {
		int i;
		for (i = 0; i < 200; i++) {
			System.out.print(i + "\t");
		}
	}
}

public class ThreadTest2 extends Thread{
	
	public static void main(String[] args) {

		System.out.println("main start");
		
		MyThread2 runnable = new MyThread2();
		
		MyThread2 mth = new MyThread2();
		Thread th1 = new Thread(mth);
		Thread th2 = new Thread(runnable);
				
		th1.start();
		th2.start();
		
		System.out.println("main end");
		
		Runnable run = new Runnable() {

			@Override
			public void run() {

				System.out.println("run");
			}
			
		};
		run.run();
	}

}
