package de.tum.in.ase.eist;

import org.easymock.EasyMockExtension;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(EasyMockExtension.class)
class ABSTest {

	@Mock
	private Sensor tractionSensor;

	@TestSubject
	private ABS abs = new ABS();


	@Test
	void testShouldNotOverrideBreakOnHighTraction() {
		expect(tractionSensor.sense()).andReturn(.90);

		replay(tractionSensor);

		assertFalse(abs.shouldOverrideBrake());
	}

	@Test
	void testShouldOverrideBreakOnLowTraction() {
		expect(tractionSensor.sense()).andReturn(.20);

		replay(tractionSensor);

		assertTrue(abs.shouldOverrideBrake());
	}
}
