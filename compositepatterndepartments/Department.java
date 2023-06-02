package compositepatterndepartments;

import java.util.List;
import java.util.ArrayList;

public class Department {
    private String name;
    private List<Developer> developers = new ArrayList<>();
    private List<Manager> managers = new ArrayList<>();

    private List<DepartmentElement> members = new ArrayList<DepartmentElement>();

    public Department(String name) {
        this.name = name;
    }

    
    public void addMember(DepartmentElement member) {
      members.add(member);
    }

    public void removeMember(DepartmentElement member) {
      members.remove(member);
    }

    

    public void displayEmployeeDetails() {
        System.out.println("Department: " + name);
        for (Developer developer : developers) {
            developer.displayEmployeeDetails();
        }
        for (Manager manager : managers) {
            manager.displayEmployeeDetails();
        }

        for (DepartmentElement member: members) {
          member.displayEmployeeDetails();
        }
          
    }
}
