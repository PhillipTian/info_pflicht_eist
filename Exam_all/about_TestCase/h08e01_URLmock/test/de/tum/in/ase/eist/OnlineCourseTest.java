package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;

import java.net.MalformedURLException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OnlineCourseTest {

	// TODO 3: Test setOnlineCourseUrl()
    @Test
    void testSetOnlineCourseUrlWithValidUrl () throws MalformedURLException {
        OnlineCourse onlineCourse = new OnlineCourse("EIST");
        onlineCourse.setUrl("https://developer.mozilla.org");
        assertEquals("https://developer.mozilla.org",onlineCourse.getUrl());
    }

    @Test
    void testSetOnlineCourseUrlWithInvalidUrl(){
            OnlineCourse onlineCourse = new OnlineCourse("EIST");
            assertThrows(MalformedURLException.class,()->{ onlineCourse.setUrl("123");});
    }
}
