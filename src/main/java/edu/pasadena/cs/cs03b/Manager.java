package edu.pasadena.cs.cs03b;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Staff> staffList; //new array list containing staff to assign under managers

    public Manager() {
        staffList = new ArrayList<>();
    }

    public void addStaff(Staff staff) {
        staffList.add(staff); //add staff under managers by adding to array list
    }

    @Override
    public String getPosition() {
        return "Manager"; //Employee function, returns position
    }

    @Override
    public void list() {
        super.list(); //Employee list function to print info

        if (staffList.isEmpty()) { //check if no staff assigned, show NONE
            System.out.println("Staff Assigned: NONE");
        }
        else {
            System.out.print("Staff Assigned: "); //if assigned, iterate thru and list each staff
            for (Staff s : staffList) {
                System.out.print(s.getName() + ", ");
            }
            System.out.println();
        }
    }
}
