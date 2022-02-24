package ch10;

public class TypeCoversionTest {

	public static void main(String[] args) {
		
		int iNum = 255;
		byte bnum = (byte)iNum; // 데이터 손실로 엉뚱한 수가 반환
		
		System.out.println(bnum);
		
		double dnum = 3.14;
		int inum = (int)dnum;
		
		System.out.println(inum);
				
		double dnum2 = 1.2;
		float fnum2 = 0.9F;
		
		int iNum1 = (int)dnum2 + (int)fnum2; // 1 + 0
		int iNum2 = (int)(dnum2 + fnum2);    // (int)2.1
		
		System.out.println(iNum1);
		System.out.println(iNum2);

	}

}
