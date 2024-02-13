package edu.pasadena.cs.cs03b;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employer {
    private List<Employee> employees; //new array list to store employees

    public Employer() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) { //add an employee to the array list
        employees.add(employee);
    }
    public boolean removeEmployee(int id) { //remove employee from array list given matching id
        for (Employee e : employees) {
            if (e.getID() == id) {
                employees.remove(e);
                return true;
            }
        }
        return false;
    }
    public void printEmployees() { //print entire array list
        System.out.println("Here are the current " + employees.size() + " employees working.");
        for (Employee e : employees) {
            e.list();
        }
    }
    public void addNewEmployee(Scanner scanner) { //use scanner inputs to input new employees
        System.out.println("-----------------------------");
        System.out.println("Please fill out the new employee details:");
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Position (Manager, Staff, Contractor): ");
        String position = scanner.nextLine().trim();

        System.out.print("Age (integer #): ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ID (integer #): ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Location: ");
        String location = scanner.nextLine().trim();

        //check position to set info
        if (position.equalsIgnoreCase("Manager")) {
            Manager manager = new Manager();
            manager.setName(name);
            manager.setPosition(position);
            manager.setAge(age);
            manager.setID(id);
            manager.setLocation(location);
            addEmployee(manager);
            System.out.println("Manager successfully added.");
        } 
        else if (position.equalsIgnoreCase("Staff")) {
            Staff staff = new Staff();
            staff.setName(name);
            staff.setPosition(position);
            staff.setAge(age);
            staff.setID(id);
            staff.setLocation(location);
            addEmployee(staff);
            System.out.println("Staff successfully added.");
        } 
        else if (position.equalsIgnoreCase("Contractor")) {
            Contractor contractor = new Contractor();
            contractor.setName(name);
            contractor.setPosition(position);
            contractor.setAge(age);
            contractor.setID(id);
            contractor.setLocation(location);
            addEmployee(contractor);
            System.out.println("Contractor successfully added.");
        } 
        else {
            System.out.println("Invalid position. Employee not added.");
        }
    }

}
