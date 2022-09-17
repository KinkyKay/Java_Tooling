package be.abis.demo;

import java.time.LocalDate;

public class DemoApp {
    public static void main(String[] args) {
        System.out.println("Demo Java tooling");

        Person part = new Person("John","Bridgewater");
        Person inst = new Person ("Gie","Indesteege");

        Company comp = new Company("ABIS", "Leuven");
        comp.setPostcode("3000");

        Course c1 = new Course("Java Tools", 3, 1500.0);
        c1.setCourseId(1769);
        Session s1 = new Session(31234 , LocalDate.of(2020,9,14),"C");
        Session s2 = new Session(31235 , LocalDate.of(2020,9,29),"C");
        c1.addSession(s1);
        c1.addSession(s2);


        System.out.println("List of sessions for course: " + c1.getCourseId() + " " + c1.getCourseLongTitle());
        for (Session s : c1.getListOfSessions() )
            System.out.println("organised on: " + s.getSessionDate() + " of type " + s.getSessionKind());



    }
}
