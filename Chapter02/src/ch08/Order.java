package ch08;

public class Order {
	public String orderNumber;
	public String orderPhoneNumber;
	public String orderAddress;
	public String orderDate;
	public String orderTime;
	public String orderPrice;
	public String menuNumber;
		public void showOrder() {
		System.out.println("�ֹ� ���� ��ȣ : " + orderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + orderPhoneNumber);
		System.out.println("�ֹ� �� �ּ� : " + orderAddress);
		System.out.println("�ֹ� ��¥ : " + orderDate);
		System.out.println("�ֹ� �ð� : " + orderTime);
		System.out.println("�ֹ� ���� : " + orderPrice);
		System.out.println("�޴� ��ȣ : " + menuNumber);
	}
	public Order() {}
	public Order(String orderNumber, String orderPhoneNumber, String orderAddress, String orderDate, 
				 String orderTime, String orderPrice, String menuNumber) {
		this.orderNumber = orderNumber;
		this.orderPhoneNumber = orderPhoneNumber;
		this.orderAddress = orderAddress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNumber = menuNumber;
	}
}
