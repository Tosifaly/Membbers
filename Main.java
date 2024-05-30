/*Create a class named 'Member' having the following members:
Data members
1 - Name,2 - Age,3- Phone number,4 - Address,5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
 Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these.
*/
// Main.java
public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", 30, "123-456-7890", "123 Main St", 50000, "Software Development");

        // Create a Manager object
        Manager manager = new Manager("Jane Smith", 40, "098-765-4321", "456 Elm St", 80000, "IT Department");

        // Print details of Employee		
        employee.printDetails();
        System.out.println();

        // Print details of Manager
        manager.printDetails();
    }
}