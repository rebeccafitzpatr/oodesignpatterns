package compositepatterndepartments;

public class Main {
  public static void main(String[] args) {
     Developer dev1 = new Developer("John");
      Developer dev2 = new Developer("Martha");
      Manager manager1 = new Manager("Anna");

      Department dep1 = new Department("Front-end");
      dep1.addMember(dev1);
      dep1.addMember(dev2);
      dep1.addMember(manager1);

      Department dep2 = new Department("Back-end");
      Developer dev3 = new Developer("Bob");
     
      dep1.displayEmployeeDetails();
      dep2.displayEmployeeDetails();
      dev3.displayEmployeeDetails();
  }
}
