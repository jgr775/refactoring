package es.ual.refactoring.test;

import es.ual.refactoring.*;
import static org.junit.Assert.*;

import org.junit.Before;

public class Test {
	private Customer yo;

	@Before
	public void setUp() {
		Movie movie1 = new Movie("Star Wars VII The Force Awakens", 1);
		Movie movie2 = new Movie("The Imitation Game", 0);

		yo = new Customer("Jose Omar");
		Rental r1 = new Rental(movie1, 10);
		Rental r2 = new Rental(movie2, 2);

		yo.addRental(r1);
		yo.addRental(r2);
	}

	@org.junit.Test
	public void statemenTest() {
		String res = "Rental Record for " + "Jose Omar" + "\n" + "\tStar Wars VII The Force Awakens\t30.0" + "\n"
				+ "\tThe Imitation Game\t2.0" + "\n" + "Amount owed is 32.0" + "\n"
				+ "You earned 3 frequent renter points";

		assertEquals(res, yo.statement());
	}

	@org.junit.Test
	public void htmlStatementTest() {
		String html = "<H1>Rentals for <EM>Jose Omar</EM></H1><P>" + "\n" + "Star Wars VII The Force Awakens: 30.0<BR>"
				+ "\n" + "The Imitation Game: 2.0<BR>" + "\n" + "<P>You owe <EM>32.0</EM><P>" + "\n"
				+ "On this rental you earned <EM>3</EM> frequent renter points<P>";
		assertEquals(html, yo.htmlStatement());
	}
}