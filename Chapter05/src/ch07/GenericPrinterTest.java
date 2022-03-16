package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
		System.out.println(plasticPrinter);
		
//		GenericPrinter powderPrinter2 = new GenericPrinter();
//		powderPrinter2.setMaterial(new Powder());
//		Powder powder = (Powder)powderPrinter.getMaterial();
//		System.out.println(powderPrinter);
//			제네릭을 쓰면 (Powder)처럼 형변환 하지 않아도 됨을 기억하기 위한 명령어들
		
//		GenericPrinter<Water> printer = new GenericPrinter<Water>();
//			<Water>는 상속 받은 클래스가 아니라 불가능하다는 것을 기억하기 위한 명령어
	}
}
