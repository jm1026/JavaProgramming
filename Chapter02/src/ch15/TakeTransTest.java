package ch15;

public class TakeTransTest {

	public static void main(String[] args) {

		Student student = new Student("Edward", 20000);
		Taxi taxi = new Taxi("�� ���� ����ý�");

		student.takeTaxi(taxi);
		
		student.showStudentInfo();
		taxi.showTaxiInfo();
	}

}
