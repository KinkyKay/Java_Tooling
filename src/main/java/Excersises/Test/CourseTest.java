package Excersises.Test;

import Excersises.Java.Course;
import Excersises.Java.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class CourseTest {
    Course c1;

    @Before
    public void setUp() throws Exception {
        c1 = new Course("Java Tools",3,1500.0);
        c1.setCourseId(12345);
        c1.setCourseShortTitle("Tooling");
        Session s1 = new Session(31234 , LocalDate.of(2020,9,14),"C");
        Session s2 = new Session(31235 , LocalDate.of(2020,9,29),"C");
        c1.addSession(s1);
        c1.addSession(s2);
    }

    @After
    public void tearDown() throws Exception{
        c1=null;
    }

    @Test
    public void testGetCourseId() {
        int testGetCoursId = c1.getCourseId();
        assertEquals("CourseID is not correct",12345,testGetCoursId);
    }

    @Test
    public void testCourseShortTitle() {
        String testCourseShortTitle = c1.getCourseShortTitle();
        assertEquals("The title is correct","Tooling", testCourseShortTitle);
    }

    @Test
    public void TestSetCourseId() {
        c1.setCourseId(123);
        assertEquals("not OK", 123, c1.getCourseId());
    }

}