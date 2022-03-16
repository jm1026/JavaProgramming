package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		ThreeDPrinter printer = new ThreeDPrinter();
		
		Powder powder = new Powder();
		printer.setMaterial(powder);
		
		Powder p = (Powder)printer.getMaterial();
		
		System.out.println(p.toString());
		
	}

}
