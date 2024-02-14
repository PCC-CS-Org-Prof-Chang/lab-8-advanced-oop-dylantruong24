package edu.pasadena.cs.cs03b;

public class Contractor extends Employee implements Freelancer {
    @Override
    public String getPosition() {
        return "Contractor"; //Employee function, returns position
    }

    @Override
    public void list() {
        super.list(); //Employee list function to print info
        int temp = (int) ( Math.random() * 2 + 1); //Randomize task performance
        if (temp == 1) {
            System.out.println(work()); //Freelancer interface function
        }
        else {
            System.out.println(rest()); //Freelancer interface function
        }
    }

    @Override
    public String work() { //Freelancer interface function
        return (getName() + " is performing his given task.");
    }

    @Override
    public String rest() { //Freelancer interface function
        return (getName() + " is resting.");
    }
}
