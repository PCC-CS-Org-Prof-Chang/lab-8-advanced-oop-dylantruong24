package edu.pasadena.cs.cs03b;

public class Staff extends Employee {
    @Override
    public String getPosition() {
        return "Staff"; //Employee function, returns position
    }

    @Override
    public void list() {
        super.list(); //Employee list function to print info
    }
}
