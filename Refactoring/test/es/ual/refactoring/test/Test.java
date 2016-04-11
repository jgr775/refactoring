package es.ual.refactoring.test;

import es.ual.refactoring.*;
import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		Movie movie1 = new Movie("Star Wars VII The Force Awakens", 1);
		Movie movie2 = new Movie("The Imitation Game", 0);

		Customer yo = new Customer("Jose Omar");
		Rental r1 = new Rental(movie1, 10);
		Rental r2 = new Rental(movie2, 2);

		yo.addRental(r1);
		yo.addRental(r2);

		String res = "Rental Record for " + "Jose Omar" + "\n" + "\tStar Wars VII The Force Awakens\t30.0" + "\n"
				+ "\tThe Imitation Game\t2.0" + "\n" + "Amount owed is 32.0" + "\n"
				+ "You earned 3 frequent renter points";

		assertEquals(res, yo.statement());
	}
}