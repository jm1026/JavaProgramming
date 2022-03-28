package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileINputStreamTestSec {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("input.txt")){
			int i;
			while ((i = fis.read()) != -1) {	// EndOfFile�� -1�� ��ȯ�ϴϱ�
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
