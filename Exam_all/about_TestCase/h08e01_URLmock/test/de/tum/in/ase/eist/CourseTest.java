package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

	// TODO 1: Test getCourseTitle()
    @Test
    void testGetCourseTitle(){
        Course course = new Course("test");
        String expected = "test";
        assertEquals(expected,course.getTitle());
    }

	// TODO 2: Test getNumberOfAttendees()
    void testNoAttendees(){
        Course course = new Course("test");
        List<Student> students = new ArrayList<>();
        course.setAttendees(students);
        assertEquals(0,course.getAttendees());
    }

    void testThreeAttendees(){
        Course course = new Course("test");
        List<Student> students = new ArrayList<>();
        Student student = new Student("1","2","3","4","5");
        students.add(student);
        students.add(student);
        students.add(student);
        course.setAttendees(students);
        assertEquals(3,course.getAttendees());
    }

}
