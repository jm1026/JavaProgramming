package ch21;

public class ContinueTest {

	public static void main(String[] args) {
		
		int num;
		
		for( num = 1; num <= 100; num++) {
			
			if( (num % 3) != 0) 
				continue;    // 3�� ����� �ƴ϶�� ������ �ǳʶٰ� ���� �˻�� �̵�
			
			System.out.println(num);  // 3�� ����� ��츸 ����
			
		}
	}

}
