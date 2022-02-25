package ch09;

public class Student {

	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
								// 참조 변수형은 이렇게 생성해서 사용해야 한다
		korea = new Subject();  // 참조 자료형으로 분리를 하는 게 
		math = new Subject();   //좀 더 각각 객체가 하는 역할과 기능을 분명하게 하는 부분이 있다. 
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	public void showScoreInfo() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
}
