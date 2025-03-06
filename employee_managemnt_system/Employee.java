import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + String.format("%.2f", salary));
        System.out.println("------------------------");
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Create a list to store employees
        List<Employee> employees = new ArrayList<>();

        // Create three employee objects
        Employee emp1 = new Employee(1, "Sonali Kumari", 75000.00);
        Employee emp2 = new Employee(2, "Kajal Kumari", 85000.00);
        Employee emp3 = new Employee(3, "Jytoi Kumari", 65000.00);

        // Add employees to the list
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        // Display details of all employees
        System.out.println("Employee List:");
        System.out.println("=========================");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
} 