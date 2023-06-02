package prototypepatternclassroom;

public class Main {
  public static void main(String[] args) {

    Classroom classroom = new Classroom("room1");

    Student student = new Student("jane", "jane123");
    classroom.addStudent(student);

    Classroom classroom2 = (Classroom) classroom.copy();

    System.out.println(classroom);
    System.out.println(classroom2);
  }
}
