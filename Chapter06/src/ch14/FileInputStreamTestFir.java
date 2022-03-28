package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTestFir {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e2) {    // null�ε� close() �Ϸ��� �ؼ� �־���.
				System.out.println(e2); // ������ NullPointException�� �ʿ�
			}
		}
		System.out.println("End");
	}
}
