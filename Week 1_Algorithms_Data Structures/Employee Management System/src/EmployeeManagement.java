import java.util.Arrays;
import employee.Employee;

public class EmployeeManagement {
  private Employee[] employees;
  private int count;

  public EmployeeManagement(int size) {
    employees = new Employee[size];
    count = 0;
  }

  public void addEmployee(Employee employee) {
    if (count < employees.length) {
      employees[count++] = employee;
    } else {
      System.out.println("Array is full. Cannot add more employees.");
    }
  }

  public Employee searchEmployee(int employeeId) {
    for (int i = 0; i < count; i++) {
      if (employees[i].getEmployeeId() == employeeId) {
        return employees[i];
      }
    }
    return null;
  }

  public void traverseEmployees() {
    for (int i = 0; i < count; i++) {
      System.out.println(employees[i]);
    }
  }

  public void deleteEmployee(int employeeId) {
    int index = -1;
    for (int i = 0; i < count; i++) {
      if (employees[i].getEmployeeId() == employeeId) {
        index = i;
        break;
      }
    }
    if (index != -1) {
      for (int i = index; i < count - 1; i++) {
        employees[i] = employees[i + 1];
      }
      employees[count - 1] = null;
      count--;
    } else {
      System.out.println("Employee not found.");
    }
  }

  public static void main(String[] args) {
    EmployeeManagement management = new EmployeeManagement(10);

    Employee emp1 = new Employee(1, "John Doe", "Manager", 60000);
    Employee emp2 = new Employee(2, "Jane Smith", "Developer", 50000);
    Employee emp3 = new Employee(3, "Emily Davis", "Designer", 40000);

    management.addEmployee(emp1);
    management.addEmployee(emp2);
    management.addEmployee(emp3);

    System.out.println("All Employees:");
    management.traverseEmployees();

    System.out.println("\nSearch Employee with ID 2:");
    System.out.println(management.searchEmployee(2));

    System.out.println("\nDelete Employee with ID 2:");
    management.deleteEmployee(2);

    System.out.println("\nAll Employees after deletion:");
    management.traverseEmployees();
  }
}
