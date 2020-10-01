package be.abis.test;

import be.abis.demo.Course;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseTest4 {
    Course c1;
    @Before
    public void setUp() throws Exception {
          c1 = new Course("Java tool", 3,500.0 );
    }

    @Test
    public void getCourseLongTitle() {
        assertEquals("Title is not the same", c1.getCourseLongTitle(), "Java Tool");
    }

    @Test
    public void getCourseDur() {
    }
}