package be.abis.demo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Session {
   private int SessionNr;
   private LocalDate sessionDate;
   private String sessionKind;
   private boolean sessionCancel;
   private Course sessionCourse;

   private ArrayList<Person> listOfEnrollees = new ArrayList<Person>();

   public Session(LocalDate aDate) {
      sessionDate = aDate;
   }

    public Session(int sessionNr, LocalDate sessionDate, String sessionKind) {
        SessionNr = sessionNr;
        this.sessionDate = sessionDate;
        this.sessionKind = sessionKind;
        this.sessionCancel = false;

    }

    public void addEnrolment(Person p) {
      listOfEnrollees.add(p);
   }

   public void removeEnrolment(Person p) {
      listOfEnrollees.remove(p);
   }

  public int getSessionNr() {
      return SessionNr;
   }

   public void setSessionNr(int sessionNr) {
      SessionNr = sessionNr;
   }

   public LocalDate getSessionDate() {
      return sessionDate;
   }

   public void setSessionDate(LocalDate sessionDate) {
      this.sessionDate = sessionDate;
   }

   public Course getSessionCourse() {
      return sessionCourse;
   }

   public void setSessionCourse(Course sessionCourse) {
      this.sessionCourse = sessionCourse;
   }
   
   public String getSessionKind() {
      return sessionKind;
   }

   public void setSessionKind(String sessionKind) {
      this.sessionKind = sessionKind;
   }

   public boolean getSessionCancel() {
      return sessionCancel;
   }

   public void setSessionCancel(boolean sessionCancel) {
      this.sessionCancel = sessionCancel;
   }

   public ArrayList<Person> getListOfEnrollees() {
      return listOfEnrollees;
   }

   public void setListOfEnrollees(ArrayList<Person> listOfEnrollees) {
      this.listOfEnrollees = listOfEnrollees;
   }
}
