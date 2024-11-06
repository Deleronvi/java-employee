package java_employee;

public class EmployeeTest {
    
public static void main(String[] args) {
    Employee empOne = new Employee("james smith");
    Employee empTwo = new Employee("Mary Anne");

    empOne.empDesignation("Senior Software Engineer");
    empOne.empSalary(1000);
    empOne.printEmployee();
    empTwo.empAge(21);
    empTwo.empDesignation("Software Engineer");
    empTwo.empSalary(500);
    empTwo.printEmployee();
   }
}



