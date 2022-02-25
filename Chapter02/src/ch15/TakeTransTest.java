package ch15;

public class TakeTransTest {

	public static void main(String[] args) {

		Student student = new Student("Edward", 20000);
		Taxi taxi = new Taxi("잘 간다 운수택시");

		student.takeTaxi(taxi);
		
		student.showStudentInfo();
		taxi.showTaxiInfo();
	}

}
