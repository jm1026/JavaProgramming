package ch21;

public class ObjectCopy2 {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibaray = new Book[5];
		
		library[0] = new Book("�¹���1", "������");
		library[1] = new Book("�¹���2", "������");
		library[2] = new Book("�¹���3", "������");
		library[3] = new Book("�¹���4", "������");
		library[4] = new Book("�¹���5", "������");
		
		copyLibaray[0] = new Book();
		copyLibaray[1] = new Book();
		copyLibaray[2] = new Book();
		copyLibaray[3] = new Book();
		copyLibaray[4] = new Book();
		
		for(int i = 0; i < copyLibaray.length; i++) {
			copyLibaray[i].setAuthor(library[i].getAuthor());
			copyLibaray[i].setTitle(library[i].getTitle());
		}
		
		
		library[0].setTitle("����");
		library[0].setAuthor("�ڿϼ�");
	
		System.out.println("======library=========");
		for( Book book : library) {
			System.out.println(book);
			book.showBookInfo();
		}
		
		System.out.println("======copy library=========");
		for( Book book : copyLibaray) {
			System.out.println(book);
			book.showBookInfo();
		}

	}

}
