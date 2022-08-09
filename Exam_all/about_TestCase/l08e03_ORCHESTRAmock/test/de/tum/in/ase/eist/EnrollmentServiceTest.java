package de.tum.in.ase.eist;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

import org.easymock.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(EasyMockExtension.class)
class EnrollmentServiceTest {

	// TODO 1: setup EnrollmentServiceTest with all necessary attributes
	@TestSubject
	private EnrollmentService enrollmentService=new EnrollmentService();

	@Mock
	private Course mock;

	@Test
	void testEnrollStudentSuccessful() {

		// TODO 2: implement the test
		Student student=new Student();
		int expectedSize=student.getCourses().size()+1;
		expect(mock.enroll(student)).andReturn(true);
		replay(mock);
		enrollmentService.enroll(student,mock);
		assertEquals(expectedSize, student.getCourses().size());
		verify(mock);

	}

	@Test
	void testEnrollStudentFailure() {

		// TODO 3: Implement the test (optional)
		Student student=new Student();
		int expectedSize=student.getCourses().size()+1;
		expect(mock.enroll(student)).andReturn(true);
		replay(mock);
		enrollmentService.enroll(student,mock);
		assertEquals(expectedSize, student.getCourses().size());
		verify(mock);
	}

}
