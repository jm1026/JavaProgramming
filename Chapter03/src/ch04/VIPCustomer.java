package ch04;

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

	@Override
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * saleRatio);
		return super.calPrice(price);
	}


	public String getAgentID() {
		return agentID;
	}
}
