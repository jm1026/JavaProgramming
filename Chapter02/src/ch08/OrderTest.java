package ch08;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		order.orderNumber = "20201102003";
		order.orderPhoneNumber = "01023450001";
		order.orderAddress = "서울시 강남구 역삼동 111-333";
		order.orderDate = "20201102";
		order.orderTime = "130258";
		order.orderPrice = "35000";
		order.menuNumber = "0003";
		
		order.showOrder();
		
		System.out.println();
		
		Order order2 = new Order("20201102003", "01023450001", "서울시 강남구 역삼동 111-333", "20201102", "130258", "35000", "0003");
		order2.showOrder();
	}
}
