package compositepatterndepartments;

public class Manager implements DepartmentElement {
  private String name;

  public Manager(String name) {
      this.name = name;
  }

 @Override
  public void displayEmployeeDetails() {
      System.out.println("Manager: " + name);
  }
}