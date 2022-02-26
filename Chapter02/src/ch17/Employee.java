package ch17;

public class Employee {
	
	private static int serialNum = 1000; // <- private���� ����
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		
		serialNum++;
		employeeId = serialNum;
	}
		
	public static int getSerialNum() {
//		int i = 0;   			// �� ������ �� �Լ� ���ο����� ����� �����Լ���. 
		 						// �� getSerialNum() �޼��尡 ȣ��� ��, �갡 ��������� �� �Լ��� ������ ������ ������ ����� ����.
		
//		employeeName = "Lee";   // getSerialNum() �޼��尡 �ҷ��� ������ employeeName�� ���� ���� �ֱ� ������ 
		                        // static �޼��� �ȿ����� �ν��Ͻ� ����(�Ϲ� ��� ����)�� ����� �� ����. 
		
		return serialNum;                
	}                                    

	public int getEmployeeId() {
//		serialNum = 1000;       // �׷����� �Ϲ� �޼��� �ȿ����� static ������ ����ϴ� ���� �ƹ� ������ ���� �ʴ´�. 
		         				// static������ �̹� �ε�� �� �޸𸮿� �ִ� �����̱� �����̴�.
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
