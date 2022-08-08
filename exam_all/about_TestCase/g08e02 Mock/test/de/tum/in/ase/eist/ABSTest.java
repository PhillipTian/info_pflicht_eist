package de.tum.in.ase.eist;

import org.easymock.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(EasyMockExtension.class)
class ABSTest {
    @TestSubject
	ABS abs = new ABS();

	@Mock
	Sensor sensor;

	@Test
	void testShouldNotOverrideBreakOnHighTraction() {

	}

	@Test
	void testShouldOverrideBreakOnLowTraction() {
		fail("Test case not implemented yet");
	}
}
