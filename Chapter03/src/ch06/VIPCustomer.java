package ch06;

public class VIPCustomer extends Customer {

	double saleRatio;
	int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
}

	@Override
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -= (int)(price * saleRatio);
	}


	@Override   // showCustomerInfo() ������
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� " + agentID + "�Դϴ�";
	}

	public int getAgentID() {
		return agentID;
	}
}
