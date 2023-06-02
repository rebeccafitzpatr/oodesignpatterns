package prototypepatternclassroom;

public class Student {
  private String name;
    private String upi;

    public Student(String name, String upi) {
      this.name = name;
      this.upi = upi;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "' upi='" + upi + "'}";
    }

    
}
