package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();

		Customer CustomerT = new Customer(10010, "Tomas");
		Customer CustomerJ = new Customer(10020, "James");
		Customer CustomerE = new GoldCustomer(10030, "Edward");
		Customer CustomerP = new GoldCustomer(10040, "Percy");
		Customer CustomerK = new VIPCustomer(10050, "Kim", 12345);
		
		customerList.add(CustomerT);
		customerList.add(CustomerJ);
		customerList.add(CustomerE);
		customerList.add(CustomerP);
		customerList.add(CustomerK);
		
		System.out.println("===== �� ���� ��� =======");
		
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� =======");
		
		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calPrice(price);
			System.out.println(customer.getCustomerName() + " ���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + " ���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "���Դϴ�.");
			
		}
	}

}
