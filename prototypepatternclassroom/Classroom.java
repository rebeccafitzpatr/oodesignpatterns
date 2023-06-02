package prototypepatternclassroom;

import java.util.List;
import java.util.ArrayList;
public class Classroom implements Prototype{
  private String id;
    private List<Student> students;

    public Classroom(String id) {
        this.id = id;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "Classroom{id='" + id + "', students=" + students.toString() + "}";
    }
    @Override 
    public Prototype copy(){
      Classroom copy = new Classroom(id);
      for (Student student : students) {
        copy.addStudent(student);
      }
      return copy;
    }
}

