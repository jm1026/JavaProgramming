package ch08;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.personHeight = 180;
		person.personWeight = 78;
		person.personGender = "����";
		person.personName = "Tomas";
		person.personAge = 37;
		
		System.out.println(person.showPersonInfo());

		Person person2 = new Person(180, 78, "����", "Tomas", 37);
		System.out.println(person2.showPersonInfo());
	}

}
