package ch15;

public class IFElseIFTest {
	
	 public static void main(String[] args) {
		   	int age = 12;
		   	int charge = 3000;
		   	
		   	if(age < 8){
		   		charge = 1000; 
		   		System.out.println("�� ���� �Ƶ��Դϴ�.");
		   	}
		   	else if(age < 14){
		   		charge = 2000;
		   		System.out.println("�ʵ��л� �Դϴ�.");
		   	}
		   	else if(age < 20){
		   		charge = 2500;
		   		System.out.println("��, �����л� �Դϴ�.");
		   	} 
		   	
		   	System.out.println("������ " + charge + "���Դϴ�.");
		   	
		   }


}