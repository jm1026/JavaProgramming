package ch14;

public class Subway {

	int subwayNumber;
	int passengerCount;
	int money;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money) {
		this.money += 1200;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayNumber + "���� �°� ���� " + passengerCount + "�� �̰�, ������ " + money + "�� �Դϴ�.");
	}
}
