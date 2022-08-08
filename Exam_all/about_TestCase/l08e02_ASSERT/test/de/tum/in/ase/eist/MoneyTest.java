package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

	private final Money m12CHF = new Money(12, Currency.CHF);
	private final Money m14CHF = new Money(14, Currency.CHF);

	@Test
	void testSimpleAdd() {
		Money expected = new Money(26, Currency.CHF);
		Money observed = m12CHF.add(m14CHF);

		// TODO Task 2: implement the assertion
		assertEquals(expected,observed);
	}

	@Test
	void testSimpleSubtract() {
		// TODO Task 3: implement the test case
		Money expected = new Money(2, Currency.CHF);
		Money observed = m14CHF.subtract(m12CHF);
		assertEquals(expected,observed);
	}

	@Test
	void testInvalidAdd() {
		Money m14USD = new Money(14, Currency.USD);

		// TODO Task 4: implement the test case
		assertThrows(IllegalArgumentException.class,()->{m14CHF.add(m14USD);});
	}
}
