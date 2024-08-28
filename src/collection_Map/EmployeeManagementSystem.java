package collection_Map;
import java.util.HashMap;
//Objective: Develop a simple employee management system using HashMap to store and manage employee details.
//Tasks:
//Create a HashMap<String, Employee>, where the key is the employee ID and the value is an Employee object.
//Implement functions to add, update, delete, and retrieve employee details.
//Implement a feature to find the highest-paid employee.
//Skills Covered: Object-oriented programming, HashMap for storing complex objects, basic CRUD operations.

//public class EmployeeManagementSystem {



    public class EmployeeManagementSystem {
        // Inner Employee class
        static class Employee {
            String id;
            String name;
            double salary;

            Employee(String id, String name, double salary) {
                this.id = id;
                this.name = name;
                this.salary = salary;
            }

            @Override
            public String toString() {
                return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary;
            }
        }

        // HashMap to store employees
        private HashMap<String, Employee> employeeMap = new HashMap<>();

        // Add an employee
        public void addEmployee(String id, String name, double salary) {
            employeeMap.put(id, new Employee(id, name, salary));
        }

        // Update an employee's details
        public void updateEmployee(String id, String name, double salary) {
            Employee employee = employeeMap.get(id);
            if (employee != null) {
                employee.name = name;
                employee.salary = salary;
            } else {
                System.out.println("Employee with ID " + id + " not found.");
            }
        }

        // Delete an employee
        public void deleteEmployee(String id) {
            if (employeeMap.remove(id) != null) {
                System.out.println("Employee with ID " + id + " deleted.");
            } else {
                System.out.println("Employee with ID " + id + " not found.");
            }
        }

        // Retrieve an employee's details
        public void getEmployee(String id) {
            Employee employee = employeeMap.get(id);
            if (employee != null) {
                System.out.println(employee);
            } else {
                System.out.println("Employee with ID " + id + " not found.");
            }
        }

        // Find the highest-paid employee
        public void getHighestPaidEmployee() {
            Employee highestPaid = null;
            for (Employee employee : employeeMap.values()) {
                if (highestPaid == null || employee.salary > highestPaid.salary) {
                    highestPaid = employee;
                }
            }
            if (highestPaid != null) {
                System.out.println("Highest Paid Employee: " + highestPaid);
            } else {
                System.out.println("No employees found.");
            }
        }

        // Main method
        public static void main(String[] args) {
            EmployeeManagementSystem ems = new EmployeeManagementSystem();

            // Adding employees
            ems.addEmployee("E001", "John Doe", 50000);
            ems.addEmployee("E002", "Jane Smith", 60000);
            ems.addEmployee("E003", "Emily Davis", 55000);

            // Updating an employee
            ems.updateEmployee("E001", "John Doe", 52000);

            // Retrieving an employee
            ems.getEmployee("E002");

            // Deleting an employee
            ems.deleteEmployee("E003");

            // Finding the highest-paid employee
            ems.getHighestPaidEmployee();
        }
    }








//}
