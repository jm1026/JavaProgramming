package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial(); // ����ȯ ���� ����
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial(); // ����ȯ ���� ����
		System.out.println(plasticPrinter);
		
//		GenericPrinter powderPrinter2 = new GenericPrinter();
//		powderPrinter2.setMaterial(new Powder());
//		Powder powder = (Powder)powderPrinter.getMaterial();
//		System.out.println(powderPrinter);
//			���׸��� ���� (Powder)ó�� ����ȯ ���� �ʾƵ� ���� ����ϱ� ���� ��ɾ��
		
//		GenericPrinter<Water> printer = new GenericPrinter<Water>();
//			<Water>�� ��� ���� Ŭ������ �ƴ϶� �Ұ����ϴٴ� ���� ����ϱ� ���� ��ɾ�
	}
}
