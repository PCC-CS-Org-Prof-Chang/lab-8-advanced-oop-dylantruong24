package edu.pasadena.cs.cs03b;

public abstract class Employee extends Person {
    private int id; //id #

    public int getID() { //get
        return id;
    }
    public void setID(int id) { //set
        this.id = id;
    }

    public abstract String getPosition(); //use to determine position

    @Override
    public void list() { //function to print info, referenced in all 3 positions
        System.out.println("-----------------------------");
        System.out.println("Name: " + getName());
        System.out.println("Position: " + getPosition());
        System.out.println("ID#: " + getID());
        System.out.println("Age: " + getAge());
        System.out.println("Based in: " + getLocation());
    }

}
