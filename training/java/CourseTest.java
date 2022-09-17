package be.abis.test;


import be.abis.demo.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {

   @Test
   public void testCoursename() {
      Course c1 = new Course("Eclipse", 1, 400);
      assertEquals("Oclipse",c1.getCourseLongTitle(),"wrong title");
   }
   @Test
   public void testCourseDuration() {
      Course c2 = new Course("Java SE", 4, 1600);
      assertEquals( 5, c2.getCourseDur(),"error in duration");
   }
}
