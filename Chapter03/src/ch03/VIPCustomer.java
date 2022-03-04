package ch03;

public class VIPCustomer extends Customer {

	double saleRatio;
	String agentID;
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
}

	
	public String getAgentID() {
		return agentID;
	}
}
