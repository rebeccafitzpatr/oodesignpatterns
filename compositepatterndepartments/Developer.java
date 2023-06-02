package compositepatterndepartments;

public class Developer implements DepartmentElement {
  private String name;

  public Developer(String name) {
      this.name = name;
  }

  @Override
  public void displayEmployeeDetails() {
      System.out.println("Developer: " + name);
  }
}
