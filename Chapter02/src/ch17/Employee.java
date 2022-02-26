package ch17;

public class Employee {
	
	private static int serialNum = 1000; // <- private으로 선언
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		
		serialNum++;
		employeeId = serialNum;
	}
		
	public static int getSerialNum() {
//		int i = 0;   			// 이 변수는 이 함수 내부에서만 선언된 지역함수다. 
		 						// 이 getSerialNum() 메서드가 호출될 때, 얘가 만들어져서 이 함수가 끝나면 없어질 변수라 상관이 없다.
		
//		employeeName = "Lee";   // getSerialNum() 메서드가 불려질 시점에 employeeName이 없을 수도 있기 때문에 
		                        // static 메서드 안에서는 인스턴스 변수(일반 멤버 변수)를 사용할 수 없다. 
		
		return serialNum;                
	}                                    

	public int getEmployeeId() {
//		serialNum = 1000;       // 그렇지만 일반 메서드 안에서는 static 변수를 사용하는 것은 아무 문제가 되지 않는다. 
		         				// static변수는 이미 로드될 때 메모리에 있는 상태이기 때문이다.
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}
