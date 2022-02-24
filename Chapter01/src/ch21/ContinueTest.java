package ch21;

public class ContinueTest {

	public static void main(String[] args) {
		
		int num;
		
		for( num = 1; num <= 100; num++) {
			
			if( (num % 3) != 0) 
				continue;    // 3의 배수가 아니라면 나머지 건너뛰고 조건 검사로 이동
			
			System.out.println(num);  // 3의 배수인 경우만 실행
			
		}
	}

}
