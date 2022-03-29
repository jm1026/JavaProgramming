package ch19;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee etiopiaCoffee = new EtiopiaAmericano();
		etiopiaCoffee.brewing();
		System.out.println();
		
		Coffee etiopiaLatte = new Latte(etiopiaCoffee);
		etiopiaLatte.brewing();
		System.out.println();
		
		Mocha mochaEtiopia = new Mocha(new Latte(new EtiopiaAmericano()));
		mochaEtiopia.brewing();
		System.out.println();
		
		Coffee KenyaCoffee = new WhippingCream(new Mocha(new Latte(new KenyaAmericano())));
		KenyaCoffee.brewing();
	}

}
